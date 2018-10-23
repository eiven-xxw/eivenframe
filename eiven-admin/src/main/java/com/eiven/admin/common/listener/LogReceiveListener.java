package com.eiven.admin.common.listener;

import com.eiven.admin.common.constant.MqQueueConstant;
import com.eiven.admin.model.entity.SysLog;
import com.eiven.admin.model.vo.LogVO;
import com.eiven.admin.service.SysLogService;
import org.slf4j.MDC;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: eiven
 * @Date: Created in 9:38 2018/10/9
 * @Component
 */
@RabbitListener(queues = MqQueueConstant.LOG_QUEUE)
public class LogReceiveListener {
    private static final String KEY_USER = "user";

    @Autowired
    private SysLogService sysLogService;

    @RabbitHandler
    public void receive(LogVO logVo) {
        SysLog sysLog = logVo.getSysLog();
        MDC.put(KEY_USER, logVo.getUsername());
        sysLog.setCreateBy(logVo.getUsername());
        sysLogService.insert(sysLog);
        MDC.remove(KEY_USER);
    }
}
