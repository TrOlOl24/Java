package com.company;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        MyArrayList l = new MyArrayList(5);
        l.add("1");
        l.add("2");
        l.add("3");
        l.add("4");
        l.add("5");
        l.add("0", 0);
        System.out.println(l.toString());
        System.out.println(l.isEmpty());
        l.clear();
        System.out.println(l.isEmpty());
    }
}