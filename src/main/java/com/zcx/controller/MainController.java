package com.zcx.controller;

import com.zcx.entity.User;
import com.zcx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zcx
 * @Title 前端控制器
 * @date 2018年09月12日 11:37
 **/
@Controller
public class MainController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index() {
        User user = userService.findById("0025fd66316f4d4cb6654929e2e96f62");
        System.out.println(user);
        return "hello";
    }


}
