package com.springmvc.exception;

/**
 * 自定义异常
 */
public class SysException2 extends Exception {

    private  String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SysException2(String message) {
        this.message = message;
    }
}
