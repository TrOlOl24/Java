package com.company;
import java.lang.*;

public class Test {

    public static void main(String[] args) {
        Book b1 = new Book("Tom", "Green", 2002);
        Book b2 = new Book("Adventure","Yellow");
        Book b3 = new Book("Live");
        Book b4 = new Book();
        b4.setYer(1999);
        System.out.println(b1);
    }
}
