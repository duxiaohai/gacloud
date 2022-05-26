package com.ga.common.core.exception.file;

/**
 * Explain:文件名大小限制异常类
 * Author: linjianhai
 * Date: 2022/5/21 17:19
 */
public class FileSizeLimitExceededException extends FileException {
    private static final long serialVersionUID = 1L;

    public FileSizeLimitExceededException(long defaultMaxSize)
    {
        super("upload.exceed.maxSize", new Object[] { defaultMaxSize });
    }
}
