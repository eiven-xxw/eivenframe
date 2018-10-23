package com.eiven.admin.common.constant;

/**
 * @author: eiven
 * @Date: Created in 9:38 2018/10/9
 * MQ 消息队列
 */
public interface MqQueueConstant {
    /**
     * log rabbit队列名称
     */
    String LOG_QUEUE = "log";

    /**
     * 发送短信验证码队列
     */
    String MOBILE_CODE_QUEUE = "mobile_code_queue";

    /**
     * 短信服务状态队列
     */
    String MOBILE_SERVICE_STATUS_CHANGE = "mobile_service_status_change";

}
