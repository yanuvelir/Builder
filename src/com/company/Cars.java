package com.company;

public class Cars {

    private String make;
    private String mark;
    private String color;
    private  int price;

    Cars(String make, String mark, String color, int price){
        this.make = make; this.mark = mark; this.color = color; this.price = price;
    }

    Cars(String make, String mark){
        this.make = make; this.mark = mark;
    }

    String getMake(){
        return make;
    }
    void setMake(String make){
        this.make = make;
    }

    String getMark(){
        return mark;
    }
    void setMark(String mark){
        this.mark = mark;
    }

    String getColor(){
        return color;
    }
    void setColor(String color){
        this.color = color;
    }

    int getPrice(){
        return price;
    }
    void setPrice(int price){
        this.price = price;
    }

}
