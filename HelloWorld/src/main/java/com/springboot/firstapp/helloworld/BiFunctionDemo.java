package com.springboot.firstapp.helloworld;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo implements BiFunction<Integer, Integer, Integer> {

    @Override
    public Integer apply(Integer i1, Integer i2) {
        return i1+i2;
    }

    public static void main(String[] args) {

        /*BiFunction<Integer, Integer, Integer> biFunctionObj = new BiFunctionDemo();
        Integer result = biFunctionObj.apply(10,20);
        System.out.println("result:"+result);*/

        // BiFunction Demo using Lambda expresssions
        BiFunction<Integer, Integer, Integer> biFunctionObj = (a, b) -> a+b;
        Function<Integer, Integer> funcObj = (x) -> x * x;
        Integer result = biFunctionObj.apply(10,20);
        System.out.println("result:"+result);

        Integer result2 =  biFunctionObj.andThen(funcObj).apply(3,4);
        System.out.println("result2:"+result2);
    }

}
