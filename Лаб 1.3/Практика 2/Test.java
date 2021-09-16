package com.company;
import com.company.Author;

public class Test {
    void test() {
        Author a = new Author("Tom", "Zooroo@rambler.ru", 'M');
        System.out.println("Name:"+a.getName()+"\nGender:"+a.getGender()+"\nEmail:"+a.getEmail());
        a.setEmail("Sardina@rambler.ru");
        System.out.println(a);
    }
}
