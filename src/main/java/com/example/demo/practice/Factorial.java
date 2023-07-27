package com.example.demo.practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter any number::");
        int fact =1;
        while(n>0){
            factorial = n * factorial;
            n--;
        }

        System.out.println("The factorial of No::"+ factorial);
    }
}
