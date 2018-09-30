package com.zcx.controller;

import com.zcx.entity.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zcx
 * @Title 建言的控制器
 * @date 2018年09月30日 15:31
 **/
@Controller
public class AdviceController {

    @RequestMapping("/advice")
    public String getSometing(@ModelAttribute("msg") String msg, DemoObj obj) {
        throw new IllegalArgumentException("非常抱歉，参数有误/"+"来自@ModelAttribute："+msg);
    }

}
