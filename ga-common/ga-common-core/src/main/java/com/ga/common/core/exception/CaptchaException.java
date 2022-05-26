package com.ga.common.core.exception;

/**
 * Explain:验证码错误异常类
 * Author: linjianhai
 * Date: 2022/5/21 17:07
 */
public class CaptchaException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public CaptchaException(String msg)
    {
        super(msg);
    }
}
