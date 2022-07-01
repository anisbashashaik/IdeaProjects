package com.springboot.firstapp.helloworld;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

class MultipleCallableTask implements Callable<String>{

    private String name;
    public MultipleCallableTask(String strName){
        this.name = strName;
    }
    @Override
    public String call() throws Exception {
        return name;
    }
}
public class MultipleCallableServiceRunner {

    public static void main(String args[]) throws ExecutionException, InterruptedException {

        //ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<MultipleCallableTask> listOfTasks = Arrays.asList(new MultipleCallableTask("Task1"),new MultipleCallableTask("Task2"),
                new MultipleCallableTask("Task3"));
        List<Future<String>> results = executorService.invokeAll(listOfTasks);
        System.out.println("Submitted for Promise");
        for(Future<String> res: results){
            System.out.println("strReturnValue:"+res.get());
        }
        System.out.println("Main Method Completed");
        executorService.shutdown();
    }
}
