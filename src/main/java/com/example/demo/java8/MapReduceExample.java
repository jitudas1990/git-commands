package com.example.demo.java8;

import java.util.Arrays;
import java.util.List;

public class MapReduceExample {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        int sum =0;
        for(int no:list){
            sum = no+ sum;
        }
    }
}
