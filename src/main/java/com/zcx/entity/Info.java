package com.zcx.entity;

/**
 * @author zcx
 * @Title 用户信息
 * @date 2018年10月18日 11:12
 **/
public class Info {
    private String loginname;
    private String password;
    private String username;

    public Info() {
    }

    public Info(String loginname, String password, String username) {
        this.loginname = loginname;
        this.password = password;
        this.username = username;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
