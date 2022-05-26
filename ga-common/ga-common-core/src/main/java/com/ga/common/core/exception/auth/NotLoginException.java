package com.ga.common.core.exception.auth;

/**
 * Explain:未能通过的登录认证异常
 * Author: linjianhai
 * Date: 2022/5/21 17:12
 */
public class NotLoginException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public NotLoginException(String message)
    {
        super(message);
    }
}
