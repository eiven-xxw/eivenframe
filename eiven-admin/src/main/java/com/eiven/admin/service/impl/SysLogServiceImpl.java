package com.eiven.admin.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eiven.admin.common.constant.CommonConstant;
import com.eiven.admin.common.util.Assert;
import com.eiven.admin.mapper.SysLogMapper;
import com.eiven.admin.model.entity.SysLog;
import com.eiven.admin.service.SysLogService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 * 日志表 服务实现类
 * </p>
 *
 * @author: eiven
 * @Date: Created in 9:38 2018/10/9
 */
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements SysLogService {

    @Override
    public Boolean updateByLogId(Long id) {
        Assert.isNull(id, "日志ID为空");

        SysLog sysLog = new SysLog();
        sysLog.setId(id);
        sysLog.setDelFlag(CommonConstant.STATUS_DEL);
        sysLog.setUpdateTime(new Date());
        return updateById(sysLog);
    }
}
