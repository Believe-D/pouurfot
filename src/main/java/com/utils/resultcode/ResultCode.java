package com.utils.resultcode;

import lombok.Data;

import java.util.ArrayList;

/**
 * @author
 * @date 2020/12/6 14:18
 * @Description 统一返回类
 * @return
 */
@Data
public class ResultCode<T> {
    private int code;
    private String msg;
    private int count;
    private Object data;


    public static ResultCode success(Object data, int total) {
        ResultCode resultCode = new ResultCode();

        resultCode.setCode(200);
        resultCode.setMsg(null);
        resultCode.setCount(total);
        resultCode.setData(data);

        return resultCode;
    }

    public static ResultCode tableSuccess(Object data, int total) {
        ResultCode resultCode = new ResultCode();

        resultCode.setCode(0);
        resultCode.setMsg("ok");
        resultCode.setCount(total);
        resultCode.setData(data);

        return resultCode;
    }

    public static ResultCode success() {
        ResultCode resultCode = new ResultCode();

        resultCode.setCode(200);
        resultCode.setCount(0);

        return resultCode;
    }

    public static ResultCode error() {
        ResultCode resultCode = new ResultCode();
        resultCode.setCode(500);
        resultCode.setData(new ArrayList<>());
        resultCode.setCount(0);

        return resultCode;
    }

    public static ResultCode error(Object data) {
        ResultCode resultCode = new ResultCode();
        resultCode.setCode(500);
        resultCode.setData(data);
        return resultCode;
    }

    public static ResultCode error(int code, Object data) {
        ResultCode resultCode = new ResultCode();
        resultCode.setCode(code);
        resultCode.setData(data);
        return resultCode;
    }

    public static ResultCode error(Integer code, String msg) {
        ResultCode resultCode = new ResultCode();
        resultCode.setCode(code);
        resultCode.setMsg(msg);

        return resultCode;
    }
}
