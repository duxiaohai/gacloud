package com.ga.common.datasource.annotition;

import com.baomidou.dynamic.datasource.annotation.DS;

import java.lang.annotation.*;

/**
 * Explain:主库数据源
 * Author: linjianhai
 * Date: 2022/5/24 8:35
 */
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@DS("master")
public @interface Master {
}
