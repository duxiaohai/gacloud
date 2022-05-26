package com.ga.common.core.exception.file;

/**
 * Explain: 文件名称超长限制异常类
 * Author: linjianhai
 * Date: 2022/5/21 17:15
 */
public class FileNameLengthLimitExceededException extends FileException {
    private static final long serialVersionUID = 1L;

    public FileNameLengthLimitExceededException(int defaultFileNameLength)
    {
        super("upload.filename.exceed.length", new Object[] { defaultFileNameLength });
    }
}

