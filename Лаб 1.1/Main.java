package com.company;
import com.company.*;
public class Main {
    public static void main(String[] args){
        PersonTest t1 = new PersonTest();
        PersonETest t2 = new PersonETest();
        HumanTest t3 = new HumanTest();
        System.out.println("Test of Person");
        t1.testP();
        System.out.println("\nTest of PersonE");
        t2.testPE();
        System.out.println("\nTest of Human");
        t3.testH();
    }
}
