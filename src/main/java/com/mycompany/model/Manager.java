package com.mycompany.model;

public class Manager extends Employee{

    private double bonus;

    public Manager(String name,String hireDay,Double salary){
        super(name,hireDay,salary);
        this.bonus=0;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Double getSalary(String s) {
        return super.getSalary() + this.bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name=" + getName()+
                " bonus=" + bonus +
                '}';
    }

}
