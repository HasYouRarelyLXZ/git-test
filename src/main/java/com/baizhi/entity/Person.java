package com.baizhi.entity;

import java.io.Serializable;
import java.util.Date;


public class Person implements Serializable {
    private String name;
    private String password;
    private String sex;
    private String year;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Person(String name, String password, String sex, String year, Date date) {
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.year = year;
        this.date = date;
    }

    public Person() {
    }
}