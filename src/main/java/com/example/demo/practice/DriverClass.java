package com.example.demo.practice;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DriverClass {
    public static void main(String[] args) {
        String str = "Siemens";
       // String reverse = Stream.of(str).map(o->new StringBuilder(o).reverse()).collect(Collectors.joining());
       // System.out.println(reverse);
        String arr[] = str.split("");
        System.out.println(Arrays.toString(arr));
    }
}
