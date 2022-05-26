package com.ga.common.core.exception.user;

import com.ga.common.core.exception.base.BaseException;

/**
 * Explain: 用户信息异常类
 * Author: linjianhai
 * Date: 2022/5/21 17:26
 */
public class UserException extends BaseException {
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
