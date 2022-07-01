package com.springboot.firstapp.helloworld;

interface Printable {
   // void print(String message);
    int adding(int a, int b);
}
public class LambdaExpressionWithParameters {

    public static void main(String[] args) {
       // Printable p = (message) -> System.out.println(message);
       // p.print("hello World");

        Printable p2 = (a,b) -> (a+b);
        Printable p3 = (a,b) -> {
            System.out.println("a:"+a);
            System.out.println("b:"+b);
            return a+b;
        };

        System.out.println(p3.adding(10, 20));
    }



}
