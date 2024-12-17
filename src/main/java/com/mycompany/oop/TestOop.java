package com.mycompany.oop;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestOop {
    public static void main(String[] args) {
        int[] arr = new int[9999999];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        double timess = System.currentTimeMillis();
        int start = 0;
        int end = arr.length;
        int num = 10000000-2;
        while(end-start>1){
            if(arr[(int)((start+end)/2)]>num){
                end = (int)((start+end)/2);
            } else if (arr[(int)((start+end)/2)]<num) {
                start = (int)((start+end)/2);
            }
            else {
                System.out.println(System.currentTimeMillis()-timess);
                break;
            }

        }
        timess = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                System.out.println(arr[i]);
                System.out.println(System.currentTimeMillis()-timess);

            }
        }



    }
}
