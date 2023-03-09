package apron

import apron.infra.parser
import apron.message.AFSDepMessage


fun main() {

    val buffer = "FIMSAFSDep                          20230307235849.72520230307235849.7252023030100000004894412UOZ 951  OZ951   20230308000500                HAN         OZ 3861 20230305NIFN   DEP       74F74YHL7415      7415   623 C01 16L 000520230308235820230307O235820230307            N   N                                                                    "
    val m = AFSDepMessage(buffer)
    m.parser(true)

}
