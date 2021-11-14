package com.ankitk10r.truckbooking.Tablayout.Fragement.Order;

class AccaptDelivryModel {
    String CustomerName;
    String CustomerNumber;
    String CustomerLocation;
    String DeliveryLocation;
    String WasteType;
    String WasteQuantity;
    String Price;

    public AccaptDelivryModel
            (String customerName,
             String customerNumber,
             String customerLocation,
             String deliveryLocation,
             String wasteType,
             String wasteQuantity,
             String price) {

        CustomerName = customerName;
        CustomerNumber = customerNumber;
        CustomerLocation = customerLocation;
        DeliveryLocation = deliveryLocation;
        WasteType = wasteType;
        WasteQuantity = wasteQuantity;
        Price = price;
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

    public String getCustomerLocation() {
        return CustomerLocation;
    }

    public void setCustomerLocation(String customerLocation) {
        CustomerLocation = customerLocation;
    }

    public String getDeliveryLocation() {
        return DeliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        DeliveryLocation = deliveryLocation;
    }

    public String getWasteType() {
        return WasteType;
    }

    public void setWasteType(String wasteType) {
        WasteType = wasteType;
    }

    public String getWasteQuantity() {
        return WasteQuantity;
    }

    public void setWasteQuantity(String wasteQuantity) {
        WasteQuantity = wasteQuantity;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }
}
