package com.ankitk10r.finalprojectofhackthone.TabMenu.AllModel;

public class Buy_waste_model {
    String waste_name;
    String waste_image_url;
    String Waste_price;
    String waste_Quantity;
    String waste_location;
    String Contact_no;
    String Company_name;
    String Track_location;


    public Buy_waste_model(String waste_name, String waste_image_url, String waste_price,
                           String waste_Quantity, String waste_location, String contact_no,
                           String company_name, String track_location) {
        this.waste_name = waste_name;
        this.waste_image_url = waste_image_url;
        Waste_price = waste_price;
        this.waste_Quantity = waste_Quantity;
        this.waste_location = waste_location;
        Contact_no = contact_no;
        Company_name = company_name;
        Track_location = track_location;
    }

    public Buy_waste_model(String waste_name, String waste_image_url, String waste_price, String waste_location) {
        this.waste_name = waste_name;
        this.waste_image_url = waste_image_url;
        Waste_price = waste_price;
        this.waste_location = waste_location;
    }
    public Buy_waste_model() {
    }

    public String getContact_no() {
        return Contact_no;
    }

    public void setContact_no(String contact_no) {
        Contact_no = contact_no;
    }

    public String getCompany_name() {
        return Company_name;
    }

    public void setCompany_name(String company_name) {
        Company_name = company_name;
    }

    public String getTrack_location() {
        return Track_location;
    }

    public void setTrack_location(String track_location) {
        Track_location = track_location;
    }

    public String getWaste_location() {
        return waste_location;
    }

    public void setWaste_location(String waste_location) {
        this.waste_location = waste_location;
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

    public String getWaste_price() {
        return Waste_price;
    }

    public void setWaste_price(String waste_price) {
        Waste_price = waste_price;
    }

    public String getWaste_Quantity() {
        return waste_Quantity;
    }

    public void setWaste_Quantity(String waste_Quantity) {
        this.waste_Quantity = waste_Quantity;
    }
}
