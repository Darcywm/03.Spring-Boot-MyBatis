package com.springboot.util;

import com.springboot.common.BaseErrorInfoInterface;
import com.springboot.common.CommonEnum;
import com.springboot.common.ResponseDo;

public class ResponseUtils {

    /**
     * 成功
     * @param data
     * @param <object>
     * @return
     */
    public static <object> ResponseDo success(object data){
        ResponseDo response = new ResponseDo();
        response.setCode(CommonEnum.SUCCESS.getCode());
        response.setMessage(CommonEnum.SUCCESS.getMessage());
        response.setData(data);
        return response;
    }

    /**
     * 失败
     */
    public static ResponseDo error(BaseErrorInfoInterface errorInfo) {
        ResponseDo response = new ResponseDo();
        response.setCode(errorInfo.getCode());
        response.setMessage(errorInfo.getMessage());
        response.setData(null);
        return response;
    }

    /**
     * 失败
     */
    public static ResponseDo error(String code, String message) {
        ResponseDo response = new ResponseDo();
        response.setCode(code);
        response.setMessage(message);
        response.setData(null);
        return response;
    }

}
