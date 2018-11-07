package com.zcx.controller;

import com.zcx.entity.UserInfo;
import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * @author zcx
 * @Title 图片上传控制器
 * @date 2018年11月07日 14:39
 **/
@Controller
@RequestMapping(value = "/v0.1")
public class FileUploadController {

    private static final Log logger = LogFactory.getLog(FileUploadController.class);

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String upload(HttpServletRequest request, @RequestParam("description") String description
                            , @RequestParam("file")MultipartFile file) throws IOException {
        logger.info(description);
        //如果文件不为空，写入上传路径
        if(!file.isEmpty()) {
            //上传文件路径
            String path = request.getServletContext().getRealPath("/images/");
            //上传文件名
            String fileName = file.getOriginalFilename();
            File filePath = new File(path,fileName);
            if(!filePath.getParentFile().exists()) {
                filePath.getParentFile().mkdirs();
            }
            file.transferTo(new File(path+File.separator+fileName));
            return "success";
        }else {
            return "error";
        }
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(HttpServletRequest request, @ModelAttribute UserInfo userInfo, Model model) throws IOException {
        logger.info(userInfo.getUsername());
        if(!userInfo.getImage().isEmpty()) {
            //上传文件路径
            String path = request.getServletContext().getRealPath("/images/");
            //上传文件名
            String filename = userInfo.getImage().getOriginalFilename();
            File file = new File(path,filename);
            if(!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            userInfo.getImage().transferTo(new File(path+File.separator+filename));
            //将用户添加到model中
            model.addAttribute("user",userInfo);
            //跳转到下载页面
            return "userInfo";
        }else {
            return "error";
        }
    }

    @RequestMapping(value = "downLoad",method = RequestMethod.GET)
    public ResponseEntity<byte[]> downLoad(HttpServletRequest request,@RequestParam("filename") String filename,Model model) throws Exception {
        //下载文件路径
        String path = request.getServletContext().getRealPath("/images/");
        File file = new File(path+File.separator+filename);
        HttpHeaders httpHeaders = new HttpHeaders();
        //下载显示的文件名，解决中文名称乱码问题
        String downLoadFileName = new String(filename.getBytes("UTF-8"),"iso-8859-1");
        //通知浏览器以attachment(下载方式)打开图片
        httpHeaders.setContentDispositionFormData("attachment",downLoadFileName);
        //application_octet_stream : 二进制流数据(最常见的文件下载)
        httpHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        // 201 HttpStatus.CREATED
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),httpHeaders,HttpStatus.CREATED);
    }
}
