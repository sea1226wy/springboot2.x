package com.springboot.domain;

import java.io.Serializable;

/**
 * @auther Seay
 * @date 2019/4/9 17:18
 */
public class JsonData implements Serializable{
    private static final long serialVersionUID = -7250114595989931049L;
    //状态码 0:成功 -1:失败
    private int code;
    //结果
    private Object data;

    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public JsonData(int code, Object data) {
        super();
        this.code = code;
        this.data = data;
    }

    public JsonData(int code, String message, Object data) {
        super();
        this.code = code;
        this.message = message;
        this.data = data;
    }
}