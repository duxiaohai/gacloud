package com.ga.common.core.exception;

/**
 * Explain:内部认证异常
 * Author: linjianhai
 * Date: 2022/5/21 17:10
 */
public class InnerAuthException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public InnerAuthException(String message)
    {
        super(message);
    }
}
