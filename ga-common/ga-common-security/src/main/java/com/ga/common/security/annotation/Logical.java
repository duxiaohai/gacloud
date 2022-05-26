package com.ga.common.security.annotation;

/**
 * Explain: 权限注解的验证模式
 * Author: linjianhai
 * Date: 2022/5/21 22:39
 */
public enum  Logical {
    /**
     * 必须具有所有的元素
     */
    AND,

    /**
     * 只需具有其中一个元素
     */
    OR
}
