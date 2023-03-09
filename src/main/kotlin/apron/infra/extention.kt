package apron.infra

import apron.logger
import java.lang.reflect.Field
import java.util.*
import kotlin.streams.toList


fun IMessage.accumLength(list: List<IMessageColumn>, idx: Int): Int {

    var length = 0

    for (i in idx - 1 downTo 0) {
        length += list[i].length
    }

    return length
}



fun IMessage.parser(debug: Boolean? = false) {


    val fields = this.javaClass.declaredFields
        .filter { i: Field ->
            i.isAnnotationPresent(
                IMessageColumn::class.java
            )
        }


    val messageColumns = fields.stream()
        .map { i: Field ->
            i.getAnnotation(
                IMessageColumn::class.java
            )
        }
        .sorted(Comparator.comparing(IMessageColumn::order)).toList()



    for (i in messageColumns.indices) {
        val column = messageColumns[i]

        var start: Int
        var end: Int
        var offset: Int

        if (i == 0) {
            start = 0
            end = column.length
        } else {
            offset = accumLength(messageColumns, i)
            start = offset
            end = if (offset < column.length) column.length else offset + column.length
        }

        if(debug == true) {
            logger.debug("{} {},{}", i, start, end)
        }

        val value = this.buffer!!.substring(start, end)

        for (field in fields) {
            if (field.getAnnotation(IMessageColumn::class.java).order == column.order) {
                try {

                    if(debug == true) {

                        logger.debug(
                            "order:{}  length:{}  -- [name: {} value: {}]",
                            column.order,
                            column.length,
                            field.name,
                            value.trim()
                        )
                    }

                    field.isAccessible = true
                    field[this] = value.trim()
                } catch (e: IllegalAccessException) {
                    e.printStackTrace()
                }
            }
        }
    }

    if(debug == true)
        logger.debug("bytes:${byte}")

}