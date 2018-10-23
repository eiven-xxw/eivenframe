
package com.eiven.admin.model.vo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: eiven
 * @Date: Created in 9:38 2018/10/9
 * spring boot 的异常对象
 */
@Data
public class ErrorPojo implements Serializable {

    @JSONField(name = "timestamp")
    private long timestamp;
    @JSONField(name = "status")
    private int status;
    @JSONField(name = "error")
    private String error;
    @JSONField(name = "exception")
    private String exception;
    @JSONField(name = "message")
    private String message;
    @JSONField(name = "path")
    private String path;
}
