package com.mycompany;

import java.util.ArrayList;
import java.util.List;

public class TaskSol {
    private static int maxInt = 20;
    private static Object lock = new Object();
    private static boolean isEvenTurn = true;


    public static void main(String[] args) throws InterruptedException {

        OneThread oneThread = new OneThread();
        TwoThread twoThread = new TwoThread();
        oneThread.start();
        twoThread.start();
}




static class OneThread extends Thread {

    public void run(){
        for(int i = 2;i<=maxInt;i+=2){
            synchronized (lock) {
                while(isEvenTurn){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(i);
                isEvenTurn = true;
                lock.notify();
            }

        }



}}

static class TwoThread extends Thread {
    public void run(){
        for(int i = 1;i<=maxInt;i+=2){
            synchronized (lock) {
                while(!isEvenTurn){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(i);
                isEvenTurn = false;
                lock.notify();
            }

        }}}}


