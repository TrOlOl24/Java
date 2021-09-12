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
    public Book(String n, String c){
        name = n;
        color = c;
        yer = 1895;
    }
    public Book(String n){
        name = n;
        color = "Green";
        yer = 1994;
    }
    public Book(){
        name = "Black and White";
        color = "Blue";
        yer = 1884;
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
        return name + ", color " + color + ", yer " + yer;
    }
}

