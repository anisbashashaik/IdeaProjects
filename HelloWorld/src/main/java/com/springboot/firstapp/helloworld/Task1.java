package com.springboot.firstapp.helloworld;

public class Task1 extends Thread{

    public void run(){
        System.out.println("\n Task1 Started");
        for(int i=10; i<15; i++){
            System.out.print("i="+i+";");
        }
        System.out.println("\n Task1 Completed");
    }
}
