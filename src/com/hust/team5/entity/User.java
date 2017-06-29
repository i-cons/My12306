package com.hust.team5.entity;

public class User {
    private String userID;
    private String username;
    private String userPhone;

    public User(String userID, String username, String userPhone) {
        this.userID = userID;
        this.username = username;
        this.userPhone = userPhone;
    }

    public User(){}

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

}
