package com.example.demo.learnlambda;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @package: com.example.demo.learnlambda
 * @describe:
 * @author: JQWang
 * @date: 2020-04-27
 */
public class Client2 {
    public static void main(String[] args) {

        // stream流
        List<String> nullList = null;
        Optional.ofNullable(nullList).orElse(new ArrayList<>());

        // lambda延迟加载
//        consumeString(System.out::println);
//        test(true,"Hello"+" world");
//        test(true,()-> "hello"+ " world");

    }
    public static void test(boolean flag,String content){
        if (flag){
            System.out.println(content);
        }
    }

    public static void test(boolean flag,MyFun fun){
        if (flag){
            System.out.println(fun.appent());
        }
    }

    interface MyFun{
        String appent();
    }
}
