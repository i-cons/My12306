package com.hust.team5.entity;

public class User {
    private String userID;
    private String userEmail;
    private String userPassword;
    private String userName;
    private String userSex;
    private String userNumber;
    private String userNumberType;
    private String userPhone;
    private String userProvince;
    private String userCity;
    private String userBirthday;
    private String userLastLogin;
    private String userState;
    private String userType;
    private String userRemark;

    public User(String userEmail, String userPassword,
                String userName, String userSex,
                String userNumber, String userNumberType,
                String userPhone, String userProvince,
                String userCity, String userBirthday,
                String userType, String userRemark) {
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userSex = userSex;
        this.userNumber = userNumber;
        this.userNumberType = userNumberType;
        this.userPhone = userPhone;
        this.userProvince = userProvince;
        this.userCity = userCity;
        this.userBirthday = userBirthday;
        this.userType = userType;
        this.userRemark = userRemark;
    }

    public User(){}

    public String getUserNumberType() {
        return userNumberType;
    }

    public void setUserNumberType(String userNumberType) {
        this.userNumberType = userNumberType;
    }

    public String getUserProvince() {
        return userProvince;
    }

    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserLastLogin() {
        return userLastLogin;
    }

    public void setUserLastLogin(String userLastLogin) {
        this.userLastLogin = userLastLogin;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

}
