package com.company;
import com.company.Test;

public class Main
{
    public static void main(String[] args)
    {
        Test t1 = new Test();
        System.out.println("Test 1:");
        t1.Test1();
        System.out.println("\nTest 2:");
        Test t2 = new Test();
        t2.Test2();
        System.out.println("\nTest 3:");
        Test t3 = new Test();
        t3.Test3();
    }
}
