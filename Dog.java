package com.company;

public class Dog {
    public String name;
    public int age;

    public Dog(String n,int a){
        name = n;
        age = a;
    }
    public Dog(String n){
        name = n;
        age = 0;
    }
    public Dog(){
        name = "Pup";
        age = 0;
    }
    public void setAge(int a) {
        age = a;
    }
    public void setName(String n) {
        name = n;
    }
    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }
    public String toString(){
        return name+", age "+age;
    }
    public void intoHumanAge(){
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }
}

