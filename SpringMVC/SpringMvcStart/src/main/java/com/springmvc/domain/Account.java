package com.springmvc.domain;

import java.security.PrivateKey;
import java.util.List;
import java.util.Map;

public class Account {
    private String UserName;
    private String PassWord;
    private String Money;

    private User user;

    private List<User> list;
    private Map<String,User> map;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    public String getMoney() {
        return Money;
    }

    public void setMoney(String money) {
        Money = money;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Account{" +
                "UserName='" + UserName + '\'' +
                ", PassWord='" + PassWord + '\'' +
                ", Money='" + Money + '\'' +
                ", user=" + user +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
