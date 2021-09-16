package com.company;
import com.company.AbstractPerson;
final public class Employer extends AbstractPerson {
    String department;
    public Employer(String name){
        super(name);
    };
    @Override
    public String think(){
        return "I am a employee";
    };
}
