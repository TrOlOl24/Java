package com.company;

public class Main {

    public static void main(String[] args) {
        Person men = new Person("Tom",50, 2.0F);
        men.out_name();
        men.out_age();
        men.out_rost();
    }
}
class Person {
    String name;
    int age;
    float rost;
    public Person(String n,int a,float r) {
        name = n;
        age = a;
        rost = r;
    }
    public void out_name() {
        System.out.printf("Name: %s\n", name);
    }
    public void out_age() {
        System.out.printf("Age: %d\n", age);
    }
    public void out_rost() {
        System.out.printf("Rost: %f\n", rost);
    }
}
