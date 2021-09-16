package com.company;

public abstract class AbstractPerson implements Human {
    String name;
    public String getName (){
        return (name);
    };
    public abstract String think();
    AbstractPerson (String name){
        this.name = name;
    };
}
