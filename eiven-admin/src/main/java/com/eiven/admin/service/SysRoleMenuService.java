package com.eiven.admin.service;


import com.baomidou.mybatisplus.service.IService;
import com.eiven.admin.model.entity.SysRoleMenu;

/**
 * <p>
 * 角色菜单表 服务类
 * </p>
 *
 * @author: eiven
 * @Date: Created in 9:38 2018/10/9
 */
public interface SysRoleMenuService extends IService<SysRoleMenu> {

    /**
     * 更新角色菜单
     *
     *
     * @param role
     * @param roleId  角色
     * @param menuIds 菜单列表
     * @return
     */
    Boolean insertRoleMenus(String role, Integer roleId, String menuIds);
}
