package org.example.springframework.beans;

/**
 * @author LCQ
 */
public class BeansException extends RuntimeException {
    public BeansException(String errorMsg){
        super(errorMsg);
    }

    public BeansException(String errorMsg, Throwable e){
        super(errorMsg, e);
    }
}
