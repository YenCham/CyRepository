package com.cy.cSpringBootShiro.core.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ${DESCRIPTION}
 *
 * @author ChenYan
 * @date2019年02月12日 11:03
 */
@Controller
@RequestMapping("/userInfo")
public class UserInfoController {
    /**
     * 用户查询
     * @return
     */
    @RequestMapping("/userList")
    public String userInfo() {
        return "userInfo";
    }

    /**
     * 用户添加
     * @return
     */
    @RequestMapping("/userAdd")
    @RequiresPermissions("userInfo:add")
    public String userInfoAdd() {
        return "userInfoAdd";
    }
}
