package com.company;
import com.company.PersonE;
import java.util.Scanner;

public class PersonETest {
    void testPE() {
        Scanner in = new Scanner(System.in);
        PersonE men = new PersonE();
        try {
            men.SetName(in.nextLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        } finally {
            System.out.println(men.GetName());
        }
        men.SetGender(PersonE.Gender.FEMALE);
        try {
            men.SetAge(in.nextInt());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(2);
        } finally {
            System.out.println(men.GetAge());
        }
        try {
            men.SetRost(in.nextFloat());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(3);
        } finally {
            System.out.println(men.GetRost());
        }
    }
}
