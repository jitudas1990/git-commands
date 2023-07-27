package com.example.demo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (t)-> System.out.println("The results: "+t);
        consumer.accept(8);

        Consumer<String> consumer1 =(str)-> System.out.println("The string is: "+ str);
        consumer1.accept("siemens");
        List<Integer> list = Arrays.asList(1,4,5,6,8);
        list.stream().forEach(p-> System.out.println(p));
    }
}
