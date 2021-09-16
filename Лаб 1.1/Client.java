package com.company;
import com.company.AbstractPerson;
final public class Client extends AbstractPerson {
    String service;
    float price;
    public Client(String name){
        super(name);
    };
    @Override
    public String think() {
        return "I am a client";
    };
}
