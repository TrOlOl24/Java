package com.company;
import java.lang.Exception;
import com.company.Const;

public class PersonE {
    String name;
    int age;
    float rost;
    Gender gender;

    public enum Gender {
        MALE(1, "Male"), FEMALE(2, "Female"), OTHER(1024, "Other");
        private int value;
        private String strvalue;

        private Gender(int value, String strvalue) {
            this.value = value;
            this.strvalue = strvalue;
        };
        public int GetV() {
            return value;
        };
        public String GetStrv() {
            return strvalue;
        };
    };

    public PersonE() {};
    public void SetGender(Gender g) {
        gender = g;
    };
    public void SetName(String n) throws Exception {
        if (n.isEmpty()) {
            throw new Exception("No line");
        } else {
            name = n;
        }
    };
    public void SetAge(int a) throws Exception {
        if (a > Const.MaxAge) {
            throw new Exception("No age");
        } else {
            age = a;
        }
    };
    public void SetRost(float r) throws Exception {
        if (r > Const.MaxRost) {
            throw new Exception("No rost");
        } else {
            rost = r;
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
