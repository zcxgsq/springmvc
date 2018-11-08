package com.zcx.controller;

import com.zcx.entity.CodeRequest;
import com.zcx.service.CodeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zcx
 * @Title 短信控制器
 * @date 2018年11月07日 19:09
 **/
@Controller
public class CodeController {
    private static final Logger logger = Logger.getLogger(CodeController.class);
    @Autowired
    private CodeService codeService;
    @RequestMapping(value = "/send/{tel}", method = RequestMethod.GET, produces = "application/json")
    public void codeSend(@PathVariable String tel, HttpServletRequest request) {
        Pattern p = Pattern.compile("^((13[0-9])|(15[^4])|(166)|(17[0-8])|(18[0-9])|(19[8-9])|(14[5-9])|(140))\\d{8}$");
        Matcher m = p.matcher(tel); // 获取 matcher 对象
        if (!m.find()) {
            logger.info("手机号码出错");
        }else {
            String messageid = codeService.sendService("+86"+tel);
            logger.info(messageid);
        }
    }
}
