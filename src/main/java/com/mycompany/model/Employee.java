package com.mycompany.model;

public class Employee {
    private String name;
    private String hireDay;
    private Double salary;

    public Employee(String name, String hireDay, Double salary) {
        this.name = name;
        this.hireDay = hireDay;
        this.salary = salary;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getHireDay() {
        return hireDay;
    }

    public void setHireDay(String hireDay) {
        this.hireDay = hireDay;
    }

    public final Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }
}
