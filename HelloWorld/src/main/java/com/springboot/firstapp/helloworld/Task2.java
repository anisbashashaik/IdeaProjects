package com.springboot.firstapp.helloworld;

public class Task2 extends Thread{

    public void run(){
        System.out.println("\n Task2 Started");
        for(int i=10; i<15; i++){
            System.out.print("i="+i+";");
        }
        System.out.println("\n Task2 Completed");
    }
}
