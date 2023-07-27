package com.example.demo.practice;


import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
        System.out.println("Enter any Number :");
        while (n > 0) {
            int r = n % 10;
            reverse = (reverse * 10) + r;
            n = n / 10;
        }
        System.out.println("reverse number:" + reverse);

    }
}
