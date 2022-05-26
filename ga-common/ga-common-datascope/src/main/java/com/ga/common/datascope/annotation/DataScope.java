package com.ga.common.datascope.annotation;

import java.lang.annotation.*;

/**
 * Explain: 数据权限过滤注解
 * Author: linjianhai
 * Date: 2022/5/21 19:42
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataScope {
    /**
     * 部门表的别名
     */
    public String deptAlias() default "";

    /**
     * 用户表的别名
     */
    public String userAlias() default "";
}
