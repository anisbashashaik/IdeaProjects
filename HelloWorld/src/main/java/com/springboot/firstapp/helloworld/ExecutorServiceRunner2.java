package com.springboot.firstapp.helloworld;

import java.util.concurrent.*;

class CallableTask implements Callable<String>{

    @Override
    public String call() throws Exception {
        return "Hello World";
    }
}
public class ExecutorServiceRunner2 {

    public static void main(String args[]) throws ExecutionException, InterruptedException {

        //ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> promise = executorService.submit(new CallableTask());
        System.out.println("Submitted for Promise");
        String strReturnValue = promise.get();
        System.out.println("strReturnValue:"+strReturnValue);
        System.out.println("Main Method Completed");
        executorService.shutdown();
    }
}
