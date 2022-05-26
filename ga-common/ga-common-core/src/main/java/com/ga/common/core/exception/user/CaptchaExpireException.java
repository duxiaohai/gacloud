package com.ga.common.core.exception.user;

/**
 * Explain:验证码失效异常类
 * Author: linjianhai
 * Date: 2022/5/21 17:26
 */
public class CaptchaExpireException extends UserException {

    private static final long serialVersionUID = 1L;

    public CaptchaExpireException()
    {
        super("user.jcaptcha.expire", null);
    }
}

