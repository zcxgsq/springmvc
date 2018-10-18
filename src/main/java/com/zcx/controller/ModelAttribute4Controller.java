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
 * @Title 测试@ModelAttribute和@RequestMapping同时注释一个方法
 * @date 2018年10月18日 10:51
 **/
@Controller
public class ModelAttribute4Controller {

    @RequestMapping(value = "/login4")
    @ModelAttribute(value = "username")
    public String login4() {
        return "admin";
    }
}
