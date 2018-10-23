package com.eiven.admin.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.eiven.admin.model.entity.SysUserRole;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
  * 用户角色表 Mapper 接口
 * </p>
 *
 * @author: eiven
 * @Date: Created in 9:38 2018/10/9
 */
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {
    /**
     * 根据用户Id删除该用户的角色关系
     *
     * @param userId 用户ID
     * @return boolean
     */
    Boolean deleteByUserId(@Param("userId") Integer userId);
}