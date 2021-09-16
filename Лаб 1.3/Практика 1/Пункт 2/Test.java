package com.company;
import com.company.Book;

public class Test {
    void test() {
        Book b = new Book("Dark Adventure", "Black", 1900);
        System.out.println("Name:"+ b.getName()+"\nColor:"+b.getColor()+"\nYer:"+b.getYer());
        b.setName("Great Wanderings");
        b.setColor("Blue");
        b.setYer(2002);
        System.out.println(b);
    }
}
