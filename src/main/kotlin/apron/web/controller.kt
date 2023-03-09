package apron.web

import apron.config.ParserConfig
import apron.infra.IMessage
import apron.infra.parser
import apron.logger
import apron.message.AFSDepMessage
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile
import java.io.BufferedReader
import java.io.InputStreamReader



@RestController
@RequestMapping("/api")
class Controller {



    @Autowired
    lateinit var parserConfig: ParserConfig


    @PostMapping("parser")
    fun read(
        @RequestParam("acRegNo") acRegNo: String? = "",
        @RequestParam("fltNum") fltNum: String? = "",
        @RequestParam("file") multipart: MultipartFile?
    ): Map<String, Any> {

        val messages = mutableListOf<IMessage>()

        multipart?.run {
            logger.debug { "parsing messages... acRegNo:${acRegNo}, fltNum:${fltNum}" }

            BufferedReader(InputStreamReader(inputStream)).use { br ->
                var line: String?
                while (br.readLine().also { line = it } != null) {

                    if (line!!.indexOf("source") > 0) {
                        line = line!!.substringAfter("[").substringBeforeLast("]")

                        val m = AFSDepMessage(line!!)

                        m.parser(parserConfig.debug)

                        m.takeIf { i ->

                            if (!acRegNo.isNullOrBlank() && !fltNum.isNullOrBlank())
                                i.acRegNo == acRegNo && i.fltNo == fltNum
                            else {
                                (!acRegNo.isNullOrBlank() && i.acRegNo == acRegNo) || (!fltNum.isNullOrBlank() && i.fltNo == fltNum)

                            }

                        }?.let {
                            println("${line},  ${m.fltNo}, ${m.acRegNo}")
                            messages += m
                        }
                    }
                }
            }
        }

        logger.debug { "found messages: ${messages.size}" }

        return mapOf("count" to messages.size, "record" to messages)

    }
}
