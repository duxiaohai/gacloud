package com.ga.common.core.exception.auth;

import org.apache.commons.lang3.StringUtils;

/**
 * Explain: 未能通过的权限认证异常
 * Author: linjianhai
 * Date: 2022/5/21 17:13
 */
public class NotPermissionException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public NotPermissionException(String permission)
    {
        super(permission);
    }

    public NotPermissionException(String[] permissions)
    {
        super(StringUtils.join(permissions, ","));
    }
}
