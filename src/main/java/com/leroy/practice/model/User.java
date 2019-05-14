package com.leroy.practice.model;

import java.io.Serializable;

public class User implements Serializable {


    public User(){}

    public User(String userName,String sex){
        this.userName = userName;
        this.sex = sex;
    }
    private String userName;

    private String sex;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "{userName = "+userName+",sex = "+sex+"}";
    }
}
