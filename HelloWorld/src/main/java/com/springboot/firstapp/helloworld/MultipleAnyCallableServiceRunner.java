package com.springboot.firstapp.helloworld;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

class MultipleAnyCallableTask implements Callable<String>{

    private String name;
    public MultipleAnyCallableTask(String strName){
        this.name = strName;
    }
    @Override
    public String call() throws Exception {
        return name;
    }
}
public class MultipleAnyCallableServiceRunner {

    public static void main(String args[]) throws ExecutionException, InterruptedException {

        //ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<MultipleAnyCallableTask> listOfTasks = Arrays.asList(new MultipleAnyCallableTask("Task1"),new MultipleAnyCallableTask("Task2"),
                new MultipleAnyCallableTask("Task3"));
        String strResult = executorService.invokeAny(listOfTasks);
        System.out.println("MultipleAnyCallableServiceRunner : strReturnValue:"+strResult);
        System.out.println("Main Method Completed");
        executorService.shutdown();
    }
}
