package com.eiven.common.constant.enums;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: eiven
 * @Date: Created in 9:38 2018/10/9
 * 短信通道模板
 */
public enum EnumSmsChannelTemplate {
    /**
     * 登录验证
     */
    LOGIN_NAME_LOGIN("loginCodeChannel", "登录验证"),
    /**
     * 服务异常提醒
     */
    SERVICE_STATUS_CHANGE("serviceStatusChange", "EivenForCloud");


    /**
     * 模板名称
     */
    @Getter
    @Setter
    private String template;
    /**
     * 模板签名
     */
    @Getter
    @Setter
    private String signName;

    EnumSmsChannelTemplate(String template, String signName) {
        this.template = template;
        this.signName = signName;
    }
}
