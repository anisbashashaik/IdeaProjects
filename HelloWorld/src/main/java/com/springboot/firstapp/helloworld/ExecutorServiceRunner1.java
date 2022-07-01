package com.springboot.firstapp.helloworld;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {

    private int num = 0;

    Task (int num){
        this.num = num;
    }
    public void run(){
        System.out.println("Task:" +num+" Started \n");
        for(int idx=0; idx<5; idx++){
            System.out.print("Task:"+num+"-idx:"+idx+";");
        }
        System.out.println("\nTask:" +num+" Completed \n");
    }

}
public class ExecutorServiceRunner1 {

    public static void main(String args[]){

        //ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.shutdown();
    }
}
