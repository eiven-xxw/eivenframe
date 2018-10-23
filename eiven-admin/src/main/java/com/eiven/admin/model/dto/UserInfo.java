package com.eiven.admin.model.dto;

import com.eiven.admin.model.entity.SysUser;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: eiven
 * @Date: Created in 9:38 2018/10/9
 * <p>
 * commit('SET_ROLES', data)
 * commit('SET_NAME', data)
 * commit('SET_AVATAR', data)
 * commit('SET_INTRODUCTION', data)
 * commit('SET_PERMISSIONS', data)
 */
@Data
public class UserInfo implements Serializable {
    /**
     * 用户基本信息
     */
    private SysUser sysUser;
    /**
     * 权限标识集合
     */
    private String[] permissions;

    /**
     * 角色集合
     */
    private String[] roles;
}
