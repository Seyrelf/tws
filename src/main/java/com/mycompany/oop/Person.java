package com.mycompany.oop;

public class Person{

    int age;
    String name;
    Gender gender;

    Person(int age, String name, Gender gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    public enum Gender{

        MALE("Man"),
        FEMALE("Wooman");

        private String gender;

        Gender(String gender){
            this.gender = gender;
        }

        public String getGender(){
            return gender;
        }

    }
}

