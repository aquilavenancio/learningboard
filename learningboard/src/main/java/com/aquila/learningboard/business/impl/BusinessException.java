package com.aquila.learningboard.business.impl;

public class BusinessException extends RuntimeException {
    
    public BusinessException(String message){
        super(message);
    }

    public BusinessException(Throwable cause){
        super(cause);
    }
}
