package com.zcx.entity;

/**
 * @author zcx
 * @Title 实体类
 * @date 2018年09月30日 14:04
 **/
public class DemoObj {
    private Long id;
    private String name;

    public DemoObj() {
    }

    public DemoObj(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
