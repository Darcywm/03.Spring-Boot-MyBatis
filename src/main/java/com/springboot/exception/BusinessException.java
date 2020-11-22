package com.springboot.exception;

import com.springboot.common.BaseErrorInfoInterface;
import lombok.Data;

@Data
public class BusinessException extends RuntimeException {

    private String errorCode;
    private String errorMessage;

    public BusinessException(){
        super();
    }

    public BusinessException(BaseErrorInfoInterface baseErrorInfo){
        this.errorCode=baseErrorInfo.getCode();
        this.errorMessage=baseErrorInfo.getMessage();
    }

    public BusinessException(BaseErrorInfoInterface baseErrorInfo, Throwable cause) {
        super(baseErrorInfo.getCode(), cause);
        this.errorCode = baseErrorInfo.getCode();
        this.errorMessage = baseErrorInfo.getMessage();
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }

}
