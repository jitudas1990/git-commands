package com.example.demo.practice;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        String str = "siemens";
        char ch[] = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : ch) {
            map.put(c, 1);
        }

    }
}
