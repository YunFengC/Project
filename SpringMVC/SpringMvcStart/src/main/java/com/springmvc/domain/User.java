package com.springmvc.domain;


import java.util.Date;

public class User  {
        private String Name;
        private String Age;

        private Date date;
        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getAge() {
            return Age;
        }

        public void setAge(String age) {
            Age = age;
        }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", Age='" + Age + '\'' +
                ", date=" + date +
                '}';
    }
}
