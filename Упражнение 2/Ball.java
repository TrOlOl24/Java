package com.company;

public class Ball {
    public String color;
    public int size;

    public Ball(String c,int s){
        color = c;
        size = s;
    }
    public Ball(String c){
        color = c;
        size = 5;
    }
    public Ball(){
        color = "Green";
        size = 4;
    }
    public void setSize(int s) {
        size = s;
    }
    public void setColor(String c) {
        color = c;
    }
    public String getColor(){
        return color;
    }
    public int getSize() {
        return size;
    }
    public String toString() {
        return color + ", size " + size;
    }
}

