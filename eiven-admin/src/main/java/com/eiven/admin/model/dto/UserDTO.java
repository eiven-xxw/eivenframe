package com.eiven.admin.model.dto;

import com.eiven.admin.model.entity.SysUser;
import lombok.Data;

import java.util.List;

/**
 * @author: eiven
 * @Date: Created in 9:38 2018/10/9
 */
@Data
public class UserDTO extends SysUser {
    /**
     * 角色ID
     */
    private List<Integer> role;

    private Integer deptId;

    /**
     * 新密码
     */
    private String newpassword1;
}
