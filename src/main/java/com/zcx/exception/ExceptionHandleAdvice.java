package com.zcx.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zcx
 * @Title 异常处理器
 * @date 2018年09月30日 15:25
 **/
@ControllerAdvice
public class ExceptionHandleAdvice {

    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception exception, WebRequest request) {
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMessage",exception.getMessage());
        return modelAndView;
    }

    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("msg","额外信息");
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.setDisallowedFields("id");
    }
}
