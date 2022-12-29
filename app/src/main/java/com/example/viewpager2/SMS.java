package com.example.viewpager2;

public class SMS {
    public String date = "";
    public String price = "";

    public SMS(String date, String price){
        this.date = date;
        this.price = price;
    };

    public String getDate(){
        return this.date;
    }

    public String getPrice(){
        return this.price;
    }
}
