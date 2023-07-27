package com.example.demo.java8;

interface Calculater{

   // void switchOn();//without parameter
    //void sum(int input);//with one parameter
    int substraction(int i,int j);


}
public class CalculaterImpl {
    public static void main(String[] args) {

       /* Calculater calculater =()-> System.out.println("The first program for java8");
        calculater.switchOn();*/
        /*Calculater calculater = (input)-> System.out.println("The Integer no"+ input);
        calculater.sum(9);*/
        Calculater calculater = (i,j)-> {
            if(i<j){
                throw new RuntimeException("i is less than j u can choose different value");
            }else {
                return i-j;
            }
        };
        System.out.println(calculater.substraction(8,93));



    }
}
