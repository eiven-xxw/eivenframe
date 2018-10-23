package com.eiven.admin.model.vo;

import com.eiven.admin.model.entity.SysLog;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: eiven
 * @Date: Created in 9:38 2018/10/9
 */
@Data
public class LogVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private SysLog sysLog;
    private String username;
}
