package com.zcx.entity;

import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @author zcx
 * @Title 用户信息
 * @date 2018年11月06日 11:25
 **/
public class UserInfo implements Serializable {
    private String username;
    //对应上传的file,类型为MultipartFile,上传文件会自动绑定到image属性当中。
    private MultipartFile image;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
