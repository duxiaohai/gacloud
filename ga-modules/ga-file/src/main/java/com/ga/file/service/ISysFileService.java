package com.ga.file.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Explain:文件上传接口
 * Author: linjianhai
 * Date: 2022/5/24 15:08
 */
public interface ISysFileService {
    /**
     * 文件上传接口
     *
     * @param file 上传的文件
     * @return 访问地址
     * @throws Exception
     */
    public String uploadFile(MultipartFile file) throws Exception;
}
