package com.warmdelightapp.Model;

public class cake {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public cake(String name, String price, String cost, String imageURL) {
        this.name = name;
        this.price = price;
        this.cost = cost;
        this.imageurl = imageURL;
    }

    public cake() {
    }

    String name,price,cost,imageurl;

}
