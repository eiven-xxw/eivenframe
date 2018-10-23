package com.eiven.admin.service;


import com.baomidou.mybatisplus.service.IService;
import com.eiven.admin.model.entity.SysLog;

/**
 * <p>
 * 日志表 服务类
 * </p>
 *
 * @author: eiven
 * @Date: Created in 9:38 2018/10/9
 */
public interface SysLogService extends IService<SysLog> {

    /**
     * 通过ID删除日志（逻辑删除）
     *
     * @param id 日志ID
     * @return true/false
     */
    Boolean updateByLogId(Long id);
}
