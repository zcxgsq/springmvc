package com.zcx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zcx
 * @Title 测试@ModelAttribute控制器
 * @date 2018年10月18日 10:51
 **/
@Controller
public class ModelAttributeController {
    @ModelAttribute("loginname")
    public String userModel1(@RequestParam("loginname") String loginname) {
        return loginname;
    }

    @RequestMapping(value = "/login1")
    public String login1() {
        return "result1";
    }
}
