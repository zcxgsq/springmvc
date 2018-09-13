package com.zcx.entity;

import java.util.Date;

/**
 * @author zcx
 * @Title 实体类
 * @date 2018年07月25日 10:53
 **/
public class User {
    //属性名和数据库表的字段对应
    private int id;
    private String username;// 用户姓名
    private String sex;// 性别
    private Date birthday;// 生日
    private String address;// 地址

    //多租户id
    private String companyId;
    //id
    private String orderId;
    //客户id
    private String customerId;
    //客户名称
    private String customerName;
    //课程id
    private String courseId;
    //课程名称
    private String courseName;
    //教师id
    private String teacherId;
    //教师名称
    private String teacherName;
    //订单编号
    private String orderNumber;
    //课程时间
    private String coursePeriod;
    //取消订单原因
    private String orderReason;
    //下单时间
    private String orderTime;
    //支付时间
    private String payTime;
    //订单状态（待付款，已付款，已分配，待退款，已退款，已完结）
    private String orderState;
    //课程系列id
    private int classId;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCoursePeriod() {
        return coursePeriod;
    }

    public void setCoursePeriod(String coursePeriod) {
        this.coursePeriod = coursePeriod;
    }

    public String getOrderReason() {
        return orderReason;
    }

    public void setOrderReason(String orderReason) {
        this.orderReason = orderReason;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", companyId='" + companyId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", teacherId='" + teacherId + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", coursePeriod='" + coursePeriod + '\'' +
                ", orderReason='" + orderReason + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", payTime='" + payTime + '\'' +
                ", orderState='" + orderState + '\'' +
                ", classId=" + classId +
                '}';
    }

}
