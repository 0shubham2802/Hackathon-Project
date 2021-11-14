package com.ankitk10r.finalprojectofhackthone.TabMenu.AllModel;

public class Sell_waste_model {
    String waste_name;
    String waste_image_url;
    String typeOfCat;
    String Quantity;
    String price;
    String Location;
    String ContactNo;
    String priceUnite;
    String UaserId;
    boolean sell;

    public Sell_waste_model(String waste_name, String waste_image_url, String typeOfCat, String quantity, String price, String location, String contactNo, String priceUnite, String uaserId, boolean sell) {
        this.waste_name = waste_name;
        this.waste_image_url = waste_image_url;
        this.typeOfCat = typeOfCat;
        Quantity = quantity;
        this.price = price;
        Location = location;
        ContactNo = contactNo;
        this.priceUnite = priceUnite;
        UaserId = uaserId;
        this.sell = sell;
    }

    public Sell_waste_model() {
    }

    public Sell_waste_model(String typeOfCat, String quantity, String price, String location, String contactNo, String priceUnite, String uaserId, boolean sell) {
        this.typeOfCat = typeOfCat;
        Quantity = quantity;
        this.price = price;
        Location = location;
        ContactNo = contactNo;
        this.priceUnite = priceUnite;
        UaserId = uaserId;
        this.sell = sell;
    }

    public String getWaste_name() {
        return waste_name;
    }

    public void setWaste_name(String waste_name) {
        this.waste_name = waste_name;
    }

    public String getWaste_image_url() {
        return waste_image_url;
    }

    public void setWaste_image_url(String waste_image_url) {
        this.waste_image_url = waste_image_url;
    }

    public String getTypeOfCat() {
        return typeOfCat;
    }

    public void setTypeOfCat(String typeOfCat) {
        this.typeOfCat = typeOfCat;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String contactNo) {
        ContactNo = contactNo;
    }

    public String getPriceUnite() {
        return priceUnite;
    }

    public void setPriceUnite(String priceUnite) {
        this.priceUnite = priceUnite;
    }

    public String getUaserId() {
        return UaserId;
    }

    public void setUaserId(String uaserId) {
        UaserId = uaserId;
    }

    public boolean isSell() {
        return sell;
    }

    public void setSell(boolean sell) {
        this.sell = sell;
    }
}
