package com.baizhi.entity;

import java.io.Serializable;

public class UserModel implements Serializable {
    private  String name;
    private  Integer num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public UserModel(String name, Integer num) {
        this.name = name;
        this.num = num;
    }

    public UserModel() {
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}
