package com.company;

public class Ball {
    public String color;
    public int size;
    public float height;

    public Ball(String c,int s,float h){
        color = c;
        size = s;
        height = h;
    }
    public void setSize(int s) {
        size = s;
    }
    public void setColor(String c) {
        color = c;
    }
    public void setHeight(float h) {
        height = h;
    }
    public String getColor(){
        return color;
    }
    public int getSize() {
        return size;
    }
    public float getHeight() {
        return height;
    }
    public String toString() {
        return "Color:"+color+", Size:"+size+", Height:"+height;
    }
}

