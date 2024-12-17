package com.mycompany.oop;

public class Man extends Person{


    public Man(int age, String name) {
        super(age,name);
        this.gender = Person.Gender.MALE;
    }

    public String getName(){
        return "Man with name: " + this.name;
    }
}
