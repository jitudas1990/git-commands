package com.example.demo.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("maruti");
        list.add("john");
        list.add("piter");
        list.add("marek");
        list.add("mac");
        for(String s:list){
            if(s.startsWith("m")){
              //  System.out.println(s);
            }
        }
        //list.stream().filter(m->m.startsWith("m")).forEach(p-> System.out.println(p));

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");

        //map.forEach((key,value)-> System.out.println(key +" "+ value));

        map.entrySet().stream().filter(k->k.getValue().startsWith("b")).forEach(p-> System.out.println(p));
    }
}
