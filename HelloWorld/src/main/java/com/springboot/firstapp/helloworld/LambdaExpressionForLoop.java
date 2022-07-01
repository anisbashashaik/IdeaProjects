package com.springboot.firstapp.helloworld;

import java.lang.reflect.Executable;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.List;

class MyTask extends Thread{

    String strThreadName ;

    public MyTask(String strThreadName){
        this.strThreadName = strThreadName;
    }
    @Override
    public void run(){
        System.out.println("Thread:"+ strThreadName+" running");
    }
}

public class LambdaExpressionForLoop {

    public static void main(String[] args) {
        List<String> lstCourses = Arrays.asList("Java", "Angular", "Sterling OMS");
        lstCourses.forEach(element -> System.out.println(element));


    }


}
