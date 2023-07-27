package com.example.demo.java8;

import java.util.Arrays;
import java.util.List;

public class SuplierDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList();
        List<String> list1 = Arrays.asList("siemens");
        System.out.println(list.stream().findAny().orElse("Hi viewers"));//if list is empty u can show custom message
        System.out.println(list1.stream().findAny().orElse(""));
    }
}
