package com.ga.common.security.annotation;

import java.lang.annotation.*;

/**
 * Explain:内部认证注解
 * Author: linjianhai
 * Date: 2022/5/21 22:39
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface InnerAuth {
    /**
     * 是否校验用户信息
     */
    boolean isUser() default false;
}
