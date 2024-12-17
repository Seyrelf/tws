package com.mycompany.model;

import java.util.ArrayList;
import java.util.List;

public class RThread implements Runnable{

    private List<Manager> managers;

    public RThread(List<Manager> managers){
        this.managers = managers;
    }

    @Override
    public void run() {
        synchronized(managers) {
        for(Manager manager : managers){
            System.out.println(Thread.currentThread().getName() +" "+ manager.getName()+"1");
        }}

    }
}
