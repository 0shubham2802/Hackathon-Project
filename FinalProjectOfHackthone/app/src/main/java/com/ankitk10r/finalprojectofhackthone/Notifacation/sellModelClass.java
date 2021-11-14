package com.ankitk10r.finalprojectofhackthone.Notifacation;

public class sellModelClass {
    String wasteName;
    String wasteUrl;
    String CustomerName;
    String CustomerNumber;
    String DeliveryAddress;

    public sellModelClass(String wasteName, String wasteUrl, String customerName, String customerNumber, String deliveryAddress) {
        this.wasteName = wasteName;
        this.wasteUrl = wasteUrl;
        CustomerName = customerName;
        CustomerNumber = customerNumber;
        DeliveryAddress = deliveryAddress;
    }

    public sellModelClass() {
    }

    public String getWasteName() {
        return wasteName;
    }

    public void setWasteName(String wasteName) {
        this.wasteName = wasteName;
    }

    public String getWasteUrl() {
        return wasteUrl;
    }

    public void setWasteUrl(String wasteUrl) {
        this.wasteUrl = wasteUrl;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerNumber() {
        return CustomerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        CustomerNumber = customerNumber;
    }

    public String getDeliveryAddress() {
        return DeliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        DeliveryAddress = deliveryAddress;
    }
}
