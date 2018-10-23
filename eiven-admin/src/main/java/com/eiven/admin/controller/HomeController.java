package com.eiven.admin.controller;

import com.eiven.admin.common.util.R;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }
    
//    @PreAuthorize("hasAuthority('ROLE_USER')")
    @RequestMapping(value="/admin/test",method = RequestMethod.POST)
    public R<String> adminTest1() {
        return new R("ROLE_USER");
    }
    
//    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @RequestMapping("/auto/test")
    public String adminTest2() {
        return "ROLE_ADMIN";
    }
}
