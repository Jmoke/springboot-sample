package com.xianjinxia.enums;

/**
 * @author  Kevin.Tse
 * @version  V1.0
 * @描述  这里是描述……
 * @create  2017/12/18  11:33
 **/
public enum ResultEnum {
    SUCCESS("200","SUCCESS"),
    SUCCESS_CHECK_SIGN("200","验签通过"),

    NO_HANDLER_FOUND_ERROR("404","NO_HANDLER_FOUND_ERROR"),
    PARAMS_ERROR("400","参数缺失"),

    UNKONW_ERROR("500","FAILED"),
    NO_RESPONSE_ERROR("500","请求无响应"),
    REQUEST_ERROR("500","请求失败"),
    REQUEST_URL_ERROR("500","请求URL为空"),
    REQUEST_PARAMS_ERROR("500","请求PARAMS为空"),
    ERROR_CHECK_SIGN("500","验签失败"),
    WARN_IP("500","非法IP"),

    ;
    private String code;
    private String msg;

    ResultEnum() {
    }

    ResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
