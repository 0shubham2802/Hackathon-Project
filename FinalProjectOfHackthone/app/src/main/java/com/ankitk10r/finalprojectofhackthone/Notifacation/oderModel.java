package com.ankitk10r.finalprojectofhackthone.Notifacation;

public class oderModel {
    String address,productId,price,contactNo,Name;

    public oderModel(String address, String productId, String price, String contactNo, String name) {
        this.address = address;
        this.productId = productId;
        this.price = price;
        this.contactNo = contactNo;
        Name = name;
    }

    public oderModel() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
