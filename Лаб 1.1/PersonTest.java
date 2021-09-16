package com.company;
import com.company.Person;
import java.util.Scanner;

public class PersonTest {
    void testP() {
        Scanner in = new Scanner(System.in);
        Person men = new Person();
        System.out.println("Enter the date of new men: ");
        if (!men.SetName(in.nextLine())){
            System.out.println("Error");
            System.exit(1);
        }
        if (!men.SetAge(in.nextInt())){
            System.out.println("Error");
            System.exit(2);
        }
        if (!men.SetRost(in.nextFloat())){
            System.out.println("Error");
            System.exit(2);
        }
        System.out.println("Name:" + men.GetName());
        System.out.println("\nAge:" + men.GetAge());
        System.out.println("\nRost:" + men.GetRost());
    }
}
