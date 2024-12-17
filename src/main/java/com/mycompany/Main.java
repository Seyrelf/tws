package com.mycompany;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        int[] nums = {2,1,3,5,6};

        int iter = 5;
        int m = 2;
        for(int i = 0;i<iter;i++){
            int min = Arrays.stream(nums).min().getAsInt();
            for(int j = 0; j<nums.length;j++) {
                if(nums[j] == min){
                    nums[j] = min*m;
                    break;
                }

        }}
        System.out.println(Arrays.toString(nums));

    }}