package com.baizhi.entity;

import java.io.Serializable;

<<<<<<< HEAD
public class Person implements Serializable{
    private  String name;
    private  String password;
    private  String sex;
    private  String year;
=======
public class Person implements Serializable {
    private  String name;
    private  String sex;
    private  String age;
>>>>>>> origin/master

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

<<<<<<< HEAD
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

=======
>>>>>>> origin/master
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
