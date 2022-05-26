package com.ga.common.core.exception.user;

/**
 * Explain:
 * Author: linjianhai
 * Date: 2022/5/21 17:27
 */
public class UserPasswordNotMatchException extends UserException {

    private static final long serialVersionUID = 1L;

    public UserPasswordNotMatchException()
    {
        super("user.password.not.match", null);
    }
}
