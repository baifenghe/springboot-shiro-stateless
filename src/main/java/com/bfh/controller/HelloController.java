package com.bfh.controller;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author bfh
 * @Date 2018/3/8.
 * @Description
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(String params1, String params2) {

        return "hello,params1=" + params1 + ",params1=" + params2;
    }

    @RequestMapping("/test")
    @RequiresRoles("admin")
    // @RequiresPermissions("userInfo:add")//权限管理;
    public String testPermission() {
        return "testPermission";
    }
}
