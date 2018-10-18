package com.zcx.controller;

import com.zcx.entity.Info;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zcx
 * @Title 测试@ModelAttribute注释返回具体类的方法
 * @date 2018年10月18日 10:51
 **/
@Controller
public class ModelAttribute3Controller {

    private static List<Info> infos;

    public ModelAttribute3Controller() {
        super();
        infos = new ArrayList<>();
        Info info = new Info("test","123456","测试用户");
        Info info1 = new Info("admin","123456","管理员");
        infos.add(info);
        infos.add(info1);
    }

    public Info find(String loginname,String password) {
       for (Info info : infos) {
           if(info.getLoginname().equals(loginname) && info.getPassword().equals(password)) {
               return info;
           }
       }
       return null;
    }

    @ModelAttribute
    public Info userModel3(@RequestParam("loginname") String loginname, @RequestParam("password") String password, Model model) {
       return find(loginname,password);
    }

    @RequestMapping(value = "/login3")
    public String login3() {
        return "result3";
    }
}
