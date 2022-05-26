package com.ga.common.log.service;

import com.ga.common.core.constant.SecurityConstants;
import com.ga.system.api.RemoteLogService;
import com.ga.system.api.domain.SysOperLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Explain:异步调用日志服务
 * Author: linjianhai
 * Date: 2022/5/24 8:46
 */
@Service
public class AsyncLogService {
    @Autowired
    private RemoteLogService remoteLogService;

    /**
     * 保存系统日志记录
     */
    @Async
    public void saveSysLog(SysOperLog sysOperLog)
    {
        remoteLogService.saveLog(sysOperLog, SecurityConstants.INNER);
    }
}
