package com.mycompany.model;

public class JThread extends Thread{

    public JThread(String name){
        super(name);
    }

    public void run(){
        System.out.println(" Thread started " + this.getName());
        int couter = 1;
        while (!this.isInterrupted()){
            System.out.println(" Thread interrupted " + couter++);
        }

        System.out.println("Thread finished " + this.getName());
    }
}
