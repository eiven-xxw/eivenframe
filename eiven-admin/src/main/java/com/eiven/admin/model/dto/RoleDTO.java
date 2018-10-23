package com.eiven.admin.model.dto;

import com.eiven.admin.model.entity.SysRole;
import lombok.Data;

/**
 * @author: eiven
 * @Date: Created in 9:38 2018/10/9
 * 角色Dto
 */
@Data
public class RoleDTO extends SysRole {
    /**
     * 角色部门Id
     */
    private Integer roleDeptId;

    /**
     * 部门名称
     */
    private String deptName;
}
