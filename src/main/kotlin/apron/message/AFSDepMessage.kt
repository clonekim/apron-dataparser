package apron.message

import apron.infra.AbstractMessage
import apron.infra.IMessageColumn

class AFSDepMessage(buffer: String?) : AbstractMessage(buffer!!) {

    @IMessageColumn(length = 4, order = 1, descritpion = "Unitsystem ID")
    var unitSystemId: String? = null

    @IMessageColumn(length = 32, order = 2, descritpion = "Message ID")
    var messageId: String? = null

    @IMessageColumn(length = 18, order = 3, descritpion = "Date and Time")
    var messageTmStmp: String? = null

    @IMessageColumn(length = 18, order = 4, descritpion = "Timestamp")
    var tmStmp: String? = null

    @IMessageColumn(length = 22, order = 5, descritpion = "AFSD_ID")
    var afsdId: String? = null

    @IMessageColumn(length = 1, order = 6, descritpion = "Message Type")
    var msgType: String? = null

    @IMessageColumn(length = 3, order = 7, descritpion = "Flight Carrier (FLC)")
    var fltCarr: String? = null

    @IMessageColumn(length = 4, order = 8, descritpion = "Flight Number (FLN)")
    var fltNo: String? = null

    @IMessageColumn(length = 1, order = 9, descritpion = "Flight Suffix Number (FLX)")
    var fltSufxNo: String? = null

    @IMessageColumn(length = 8, order = 10, descritpion = "Flight Identifier (FLT)")
    var fltIdnf: String? = null

    @IMessageColumn(length = 8, order = 11, descritpion = "Schedule Date of Departure (SDT)")
    var schdDateDep: String? = null

    @IMessageColumn(length = 4, order = 12, descritpion = "Schedule Time of Departure (STD)")
    var schdTimeDep: String? = null

    @IMessageColumn(length = 2, order = 13, descritpion = "Codeshare status (SST)")
    var cdsStat: String? = null

    @IMessageColumn(length = 8, order = 14, descritpion = "Master flight id for this Codeshare Flight (MFF)")
    var masterFltIdCdsFlt: String? = null

    @IMessageColumn(length = 3, order = 15, descritpion = "Master Flight Carrier (MFC)")
    var masterFltCarr: String? = null

    @IMessageColumn(length = 4, order = 16, descritpion = "Master Flight Number (MFN)")
    var masterFltNo: String? = null

    @IMessageColumn(length = 1, order = 17, descritpion = "Master Flight Suffix (MFX)")
    var masterFltSufx: String? = null

    @IMessageColumn(length = 3, order = 18, descritpion = "Destination Airport (DES)")
    var destArpt: String? = null

    @IMessageColumn(length = 3, order = 19, descritpion = "First Airport Stop (VI1)")
    var firstArptStop: String? = null

    @IMessageColumn(length = 3, order = 20, descritpion = "Second Airport Stop (VI2)")
    var scdArptStop: String? = null

    @IMessageColumn(length = 3, order = 21, descritpion = "Third Airport Stop (VI3)")
    var thirdArptStop: String? = null

    @IMessageColumn(length = 3, order = 22, descritpion = "Link Airline (LKC)")
    var linkArln: String? = null

    @IMessageColumn(length = 4, order = 23, descritpion = "Link Flight Number (LKN)")
    var linkFltNo: String? = null

    @IMessageColumn(length = 1, order = 24, descritpion = "Link Suffix Number (LKX)")
    var linkSufxNo: String? = null

    @IMessageColumn(length = 8, order = 25, descritpion = "Link Date (LKS)")
    var linkDate: String? = null

    @IMessageColumn(length = 1, order = 26, descritpion = "Irregular Flight (IRR)")
    var irrgFlt: String? = null

    @IMessageColumn(length = 1, order = 27, descritpion = "Type of Flight (TOF)")
    var typeFlt: String? = null

    @IMessageColumn(length = 1, order = 28, descritpion = "Service Type (FST)")
    var svcType: String? = null

    @IMessageColumn(length = 1, order = 29, descritpion = "Transit indicator (TRA)")
    var transInd: String? = null

    @IMessageColumn(length = 3, order = 30, descritpion = "Handling Agent (HDL)")
    var handleAgent: String? = null

    @IMessageColumn(length = 3, order = 31, descritpion = "Remark 1 (RM1)")
    var rem1: String? = null

    @IMessageColumn(length = 3, order = 32, descritpion = "Remark 2 (RM2)")
    var rem2: String? = null

    @IMessageColumn(length = 3, order = 33, descritpion = "Remark 3 (RM3)")
    var rem3: String? = null

    @IMessageColumn(length = 1, order = 34, descritpion = "Special Flight Indicator")
    var spclFltInd: String? = null

    @IMessageColumn(length = 3, order = 35, descritpion = "Aircraft Type (TYP)")
    var acType: String? = null

    @IMessageColumn(length = 3, order = 36, descritpion = "Aircraft Subtype (TYS)")
    var acSubType: String? = null

    @IMessageColumn(length = 12, order = 37, descritpion = "Aircraft Registration Number (REG)")
    var acRegNo: String? = null

    @IMessageColumn(length = 4, order = 38, descritpion = "Abbreviated Registration Number (RGA)")
    var abrvRegNo: String? = null

    @IMessageColumn(length = 3, order = 39, descritpion = "Aircraft Passenger Capacity (CAP)")
    var acPaxCpct: String? = null

    @IMessageColumn(length = 4, order = 40, descritpion = "Stand Position (PAK)")
    var standPostn: String? = null

    @IMessageColumn(length = 4, order = 41, descritpion = "Departure Terminal (TER)")
    var depTerm: String? = null

    @IMessageColumn(length = 4, order = 42, descritpion = "Runway Number (RWY)")
    var rwyNo: String? = null

    @IMessageColumn(length = 4, order = 43, descritpion = "Estimated Time of Departure (ETD)")
    var estmTimeDep: String? = null

    @IMessageColumn(length = 8, order = 44, descritpion = "Estimated Date of Departure (EDT)")
    var estmDateDep: String? = null

    @IMessageColumn(length = 4, order = 45, descritpion = "Last Known Time of Departure (LTD)")
    var lastKnownTimeDep: String? = null

    @IMessageColumn(length = 8, order = 46, descritpion = "Last Known Date of Departure (LDD)")
    var lastKnownDateDep: String? = null

    @IMessageColumn(length = 1, order = 47, descritpion = "Suffix for LTD (LAX)")
    var sufxLTD: String? = null

    @IMessageColumn(length = 4, order = 48, descritpion = "Off Block time (SPO)")
    var offBlockTime: String? = null

    @IMessageColumn(length = 8, order = 49, descritpion = "Off Block date (SOD)")
    var offBlockDate: String? = null

    @IMessageColumn(length = 4, order = 50, descritpion = "Actual Time of Departure (ATD)")
    var actlTimeDep: String? = null

    @IMessageColumn(length = 8, order = 51, descritpion = "Actual Date of Departure (ADT)")
    var actlDateDep: String? = null

    @IMessageColumn(length = 1, order = 52, descritpion = "Cancelled Indicator (CNL)")
    var canclInd: String? = null

    @IMessageColumn(length = 3, order = 53, descritpion = "Cancelled Reason Code (CNR)")
    var canclRsonCode: String? = null

    @IMessageColumn(length = 1, order = 54, descritpion = "Diversion Indicator (DIV)")
    var divrsInd: String? = null

    @IMessageColumn(length = 3, order = 55, descritpion = "Diversion Reason Code (DVR)")
    var divrsRsonCode: String? = null

    @IMessageColumn(length = 1, order = 56, descritpion = "Boarding Indicator (BDS)")
    var brdgInd: String? = null

    @IMessageColumn(length = 1, order = 57, descritpion = "Optional PA Language (MOJ)")
    var optnPALang: String? = null

    @IMessageColumn(length = 2, order = 58, descritpion = "Irregularity Code 1 (IR1)")
    var irrgtCode1: String? = null

    @IMessageColumn(length = 2, order = 59, descritpion = "Irregularity Code 2 (IR2)")
    var irrgtCode2: String? = null

    @IMessageColumn(length = 4, order = 60, descritpion = "First Delay Time (DL1)")
    var firstDelyTime: String? = null

    @IMessageColumn(length = 4, order = 61, descritpion = "Second Delay Time (DL2)")
    var scdDelyTime: String? = null

    @IMessageColumn(length = 4, order = 62, descritpion = "Gate Departure number")
    var gateDeptrNo: String? = null

    @IMessageColumn(length = 4, order = 63, descritpion = "Previous Gate Departure Number (GRP)")
    var prevGateDepNo: String? = null

    @IMessageColumn(length = 4, order = 64, descritpion = "Check-in open time (CIO)")
    var chkInOpenTime: String? = null

    @IMessageColumn(length = 8, order = 65, descritpion = "Check-in open date (COD)")
    var chkInOpenDate: String? = null

    @IMessageColumn(length = 4, order = 66, descritpion = "Check-in close Time (CIC)")
    var chkInCloseTime: String? = null

    @IMessageColumn(length = 8, order = 67, descritpion = "Check-in close date (CCD)")
    var chkInCloseDate: String? = null

    @IMessageColumn(length = 17, order = 68, descritpion = "Check In Counter Range(CID)")
    var chkInRange: String? = null

    @IMessageColumn(length = 1, order = 69, descritpion = "Gate Status (GST)")
    var gateStat: String? = null

    @IMessageColumn(length = 1, order = 70, descritpion = "Check in Status (CHS)")
    var chkInStat: String? = null
}