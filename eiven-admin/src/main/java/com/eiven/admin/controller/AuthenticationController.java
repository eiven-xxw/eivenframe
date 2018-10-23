package com.eiven.admin.controller;

import com.eiven.admin.common.util.R;
import com.eiven.admin.service.Authentication.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: eiven
 * @Date: Created in 9:38 2018/10/9
 */
@RestController
public class AuthenticationController {

    @Autowired
    private AuthService authService;
    /**
     * 认证页面
     * @return ModelAndView
     */
    @GetMapping("/require")
    public ModelAndView require() {
        return new ModelAndView("ftl/login");
    }

    @RequestMapping(value = "/auth/login", method = RequestMethod.POST)
    public R<String> createAuthenticationToken(
            String username,String password
    ) throws AuthenticationException{
        //  @RequestBody JwtAuthenticationRequest authenticationRequest
        final String token = authService.login(username,password);
        // Return the token
        return new R(token);
    }
    /**
     * 用户信息校验
     * @param authentication 信息
     * @return 用户信息
     */
    @RequestMapping("/user")
    public Object user(Authentication authentication) {
        return authentication.getPrincipal();
    }
   /* @RequestMapping(value = "/auth/login", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(
            String username,String password
    ) throws AuthenticationException {
        //  @RequestBody JwtAuthenticationRequest authenticationRequest
        final String token = authService.login(username,password);

        // Return the token
        return ResponseEntity.ok(token);
    }*/

    /*@RequestMapping(value = "/auth/login", method = RequestMethod.GET)
    public ResponseEntity<?> refreshAndGetAuthenticationToken(
            HttpServletRequest request) throws AuthenticationException{
        String token = request.getHeader(tokenHeader);
        String refreshedToken = authService.refresh(token);
        if(refreshedToken == null) {
            return ResponseEntity.badRequest().body(null);
        } else {
            return ResponseEntity.ok(new JwtAuthenticationResponse(refreshedToken));
        }
    }*/
    /**
     * 清除Redis中 accesstoken refreshtoken
     *
     * @param accesstoken  accesstoken
     * @return true/false
     */
   /* @PostMapping("/removeToken")
    @CacheEvict(value = SecurityConstants.TOKEN_USER_DETAIL, key = "#accesstoken")
    public R<Boolean> removeToken(String accesstoken) {
        return new R<>( consumerTokenServices.revokeToken(accesstoken));
    }*/
}