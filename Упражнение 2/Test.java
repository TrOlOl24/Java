package com.company;
import java.lang.*;

public class Test {

    public static void main(String[] args) {
        Ball c1 = new Ball("Blue", 2);
        Ball c2 = new Ball("Black");
        Ball c3 = new Ball();
        c3.setSize(1);
        System.out.println(c1);
    }
}
