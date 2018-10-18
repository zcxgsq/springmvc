package com.zcx.controller;

import com.zcx.entity.Info;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zcx
 * @Title @RequestMapping注释一个方法的参数
 * @date 2018年10月18日 10:51
 **/
@Controller
public class ModelAttribute5Controller {

    @ModelAttribute("info")
    public Info userModel5(@RequestParam("loginname") String loginname,@RequestParam("password") String password) {
        Info info = new Info();
        info.setLoginname(loginname);
        info.setPassword(password);
        return info;
    }

    @RequestMapping(value = "/login5")
    public String login5(@ModelAttribute("info") Info info) {
        info.setUsername("管理员");
        return "result5";
    }
}
