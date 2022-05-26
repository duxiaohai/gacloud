package com.ga.common.core.exception.file;

import com.ga.common.core.exception.base.BaseException;

/**
 * Explain: 文件信息异常类
 * Author: linjianhai
 * Date: 2022/5/21 17:15
 */
public class FileException extends BaseException {
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args)
    {
        super("file", code, args, null);
    }

}
