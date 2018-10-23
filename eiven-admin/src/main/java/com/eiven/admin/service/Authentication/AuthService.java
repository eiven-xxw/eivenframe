package com.eiven.admin.service.Authentication;


import com.eiven.admin.model.entity.SysUser;

public interface AuthService {
    SysUser register(SysUser userToAdd);
    String login(String username, String password);
    String refresh(String oldToken);
}
