
package com.eiven.admin.service.impl;

import com.eiven.admin.mapper.SysUserMapper;
import com.eiven.admin.model.vo.UserDetailsImpl;
import com.eiven.admin.model.vo.UserVO;
import com.eiven.admin.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author: eiven
 * @Date: Created in 9:38 2018/10/9
 * <p>
 */
@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public UserDetailsImpl loadUserByUsername(String username) throws UsernameNotFoundException {
        UserVO userVo = sysUserMapper.selectUserVoByUsername(username);
        return new UserDetailsImpl(userVo);
    }
}
