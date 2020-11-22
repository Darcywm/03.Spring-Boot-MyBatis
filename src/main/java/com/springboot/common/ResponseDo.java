package com.springboot.common;


import com.springboot.exception.BusinessException;
import lombok.Data;

@Data
public class ResponseDo<T> {
    /**
     * 响应代码
     */
    private String code;
    /**
     * 响应消息
     */
    private String message;
    /**
     * 响应数据
     */
    private T data;

    public ResponseDo(){ }

    public ResponseDo(BusinessException businessException){
        this.code=businessException.getErrorCode();
        this.message=businessException.getErrorMessage();
    }


}
