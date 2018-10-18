package com.zcx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zcx
 * @Title 测试@ModelAttribute注释void返回值的方法
 * @date 2018年10月18日 10:51
 **/
@Controller
public class ModelAttribute2Controller {
    @ModelAttribute
    public void userModel1(@RequestParam("loginname") String loginname, @RequestParam("password") String password, Model model) {
        model.addAttribute("loginname",loginname);
        model.addAttribute("password",password);
    }

    @RequestMapping(value = "/login2")
    public String login1() {
        return "result2";
    }
}
