package com.jxf.appservice.bean;

public class UserBean extends BaseBean {

    private int id;
    private String password;
    private String username;
    private int age;


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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public String toString() {
//
//        return "id:" + this.id + ",name:" + this.username + ",age:" + this.age;
//    }
}
