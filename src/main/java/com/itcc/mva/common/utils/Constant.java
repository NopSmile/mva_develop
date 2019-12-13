package com.itcc.mva.common.utils;

/**
 * 根据github项目中，您必须将lockAtMostFor设置为比正常执行时间长得多的值。这个时间小于轮训时间
 * 否则会出问题
 */
public class Constant {

    public static final int HTTP_TIMEOUT=60000;//默认超时时间

    public static final int NO_PARSER_IFLY = 25; //科大讯飞解析数量
    public static final int NO_PARSER = 25; //捷通解析数量

    public static final int ASRPARSER_SUCCESS = 1; //捷通成功
    public static final int ASRPARSER_FAIL = 2; //捷通失败
    public static final int ASRPARSER_IFLY_SUCCESS = 1; //科大成功
    public static final int ASRPARSER_IFLY_FAIL = 2; //科大失败


    public static final int NO_SENDER = 25; //部委发送数量
    public static final int SEND_SUCCESS = 1; //部委成功
    public static final int SEND_FAIL = 2; //部委失败

    //转科大写音频回调地址
    public static String NOTIFYURL="http://192.168.102.115:52113/quark/callback";
    //科大离线转写引擎服务器地址
    public static String URL="http://172.16.12.231:9505/quark_procer";
    //科大待转写音频下载地址
    public static String AUDIO="http://172.16.12.178:52111/";
}
