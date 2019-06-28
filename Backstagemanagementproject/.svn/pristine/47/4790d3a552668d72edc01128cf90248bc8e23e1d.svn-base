package com.backstage.damain;

public class Traveller {

    private String tid;
    private String name;
    private String sex;
    private String phoneNum;
    private int credentialsType;
    private String credentialsTypeStr;//证件类型 0身份证 1护照 2军官证
    private String credentialsNum;
    private int travellerType;//旅客类型(人群) 0 成人 1 儿童
    private String travellerTypeStr;


    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getCredentialsType() {
        return credentialsType;
    }

    public void setCredentialsType(int credentialsType) {
        this.credentialsType = credentialsType;
    }

    public String getCredentialsNum() {
        return credentialsNum;
    }

    public void setCredentialsNum(String credentialsNum) {
        this.credentialsNum = credentialsNum;
    }

    public int getTravellerType() {
        return travellerType;
    }

    public void setTravellerType(int travellerType) {
        this.travellerType = travellerType;
    }

    public String getTravellerTypeStr() {

        if(getTravellerType()==0){
            travellerTypeStr = "成人";
        }else{
            travellerTypeStr = "儿童";
        }
        return travellerTypeStr;
    }

    public void setTravellerTypeStr(String travellerTypeStr) {
        this.travellerTypeStr = travellerTypeStr;
    }

    public String getCredentialsTypeStr() {
        if(getCredentialsType()==0){
            credentialsTypeStr="身份证";
        }
        if(getCredentialsType()==1){
            credentialsTypeStr="护照";
        }
        if(getCredentialsType()==2){
            credentialsTypeStr="军官证";
        }
        return credentialsTypeStr;
    }

    public void setCredentialsTypeStr(String credentialsTypeStr) {
        this.credentialsTypeStr = credentialsTypeStr;
    }
}
