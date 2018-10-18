package com.zcx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zcx
 * @Title 测试@ModelAttribute控制器
 * @date 2018年10月18日 10:33
 **/
@Controller
public class FormController {

    @RequestMapping(value = "/{formName}")
    public String loginForm(@PathVariable String formName) {
        return formName;
    }

}
