package com.ankitk10r.finalprojectofhackthone;

public class usear_Info {
    String UserName,UserEmail, UserPass,UserAddress;
    String ContactNo,address,PinCode,State,country;

    public usear_Info(String userName, String userEmail, String userPass) {
        UserName = userName;
        UserEmail = userEmail;
        UserPass = userPass;
    }

    public usear_Info() {
    }

    public usear_Info(String contactNo, String address, String pinCode, String state, String country) {
        ContactNo = contactNo;
        this.address = address;
        PinCode = pinCode;
        State = state;
        this.country = country;
    }

    public usear_Info(String userName, String userEmail, String userPass, String userAddress) {
        UserName = userName;
        UserEmail = userEmail;
        UserPass = userPass;
        UserAddress = userAddress;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String contactNo) {
        ContactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPinCode() {
        return PinCode;
    }

    public void setPinCode(String pinCode) {
        PinCode = pinCode;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }

    public String getUserPass() {
        return UserPass;
    }

    public void setUserPass(String userPass) {
        UserPass = userPass;
    }

    public String getUserAddress() {
        return UserAddress;
    }

    public void setUserAddress(String userAddress) {
        UserAddress = userAddress;
    }
}
