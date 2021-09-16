package com.company;
import com.company.Const;

public class Person {
    String name;
    int age;
    float rost;

    public Person() {};
    public boolean SetName(String n) {
        if (!n.isEmpty()) {
            name = n;
            return true;
        }
        else {
            return false;
        }
    };
    public boolean SetAge (int a) {
        if (a < Const.MaxAge) {
            age = a;;
            return true;
        }
        else {
            return false;
        }
    };
    public boolean SetRost (float r) {
        if (r < Const.MaxRost) {
            rost = r;;
            return true;
        }
        else {
            return false;
        }
    };
    public String GetName () {
        return (name);
    };
    public int GetAge () {
        return (age);
    };
    public float GetRost () {
        return (rost);
    };
}
