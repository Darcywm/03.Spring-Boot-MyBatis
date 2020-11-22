package com.springboot.common;

public enum CommonEnum implements BaseErrorInfoInterface {
    SUCCESS("0000","success"),
    IS_NULL("0001","value is null"),
    SERVER_BUSY("503","server busy");


    /*错误代码*/
    private String code;
    /*错误描述*/
    private String message;

    CommonEnum(String code, String message) {
        this.code=code;
        this.message=message;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
