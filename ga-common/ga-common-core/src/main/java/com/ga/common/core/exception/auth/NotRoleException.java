package com.ga.common.core.exception.auth;

import org.apache.commons.lang3.StringUtils;

/**
 * Explain: 未能通过的角色认证异常
 * Author: linjianhai
 * Date: 2022/5/21 17:13
 */
public class NotRoleException extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    public NotRoleException(String role)
    {
        super(role);
    }

    public NotRoleException(String[] roles)
    {
        super(StringUtils.join(roles, ","));
    }
}

