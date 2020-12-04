package com.fengmaster.lifegameserver.infrastructure.common;

public class BusinessException extends RuntimeException{

    private Integer code;
    private String message;

    public BusinessException(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
