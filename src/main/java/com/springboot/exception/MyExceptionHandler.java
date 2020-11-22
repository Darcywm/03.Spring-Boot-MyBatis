package com.springboot.exception;

import com.springboot.common.ResponseDo;
import com.springboot.util.ResponseUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public ResponseDo myExceptionHandler(BusinessException e){
        return ResponseUtils.error(e.getErrorCode(),e.getErrorMessage());
    }
}
