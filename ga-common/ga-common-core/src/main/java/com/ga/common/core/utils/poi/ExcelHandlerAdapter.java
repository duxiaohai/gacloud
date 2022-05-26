package com.ga.common.core.utils.poi;

/**
 * Explain:Excel数据格式处理适配器
 * Author: linjianhai
 * Date: 2022/5/21 18:23
 */
public interface ExcelHandlerAdapter {
    /**
     * 格式化
     *
     * @param value 单元格数据值
     * @param args excel注解args参数组
     *
     * @return 处理后的值
     */
    Object format(Object value, String[] args);
}
