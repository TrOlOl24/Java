package com.company;
import com.company.Ball;

public class Test {
    void test(){
        Ball b = new Ball("Green",4,1.5F);
        System.out.println("Color:"+b.getColor()+"\nSize:"+b.getSize()+"\nHeight:"+b.getHeight());
        b.setColor("Black");
        b.setSize(5);
        b.setHeight(2.0F);
        System.out.println(b);
    }
}