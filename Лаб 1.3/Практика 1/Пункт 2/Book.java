package com.company;

public class Book {
    public String name;
    public String color;
    public int yer;

    public Book(String n,String c,int y){
        name =n;
        color = c;
        yer = y;
    }
    public void setYer(int y) {
        yer = y;
    }
    public void setName(String n){
        name = n;
    }
    public void setColor(String c) {
        color = c;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public int getYer() {
        return yer;
    }
    public String toString() {
        return "Name:"+name + ", Color:" + color + ", Yer:" + yer;
    }
}

