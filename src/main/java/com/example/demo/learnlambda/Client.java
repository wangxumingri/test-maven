package com.example.demo.learnlambda;

import java.util.Date;

/**
 * @package: com.example.demo.learnlambda
 * @describe:
 * @author: JQWang
 * @date: 2020-04-27
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 访问静态方法:
         *  类名::静态方法
//         */
//        FunctionISomething<String,String> functionISomething = Something::startsWith;
//        String returnValue = functionISomething.invoke("456");
//        System.out.println(returnValue);
//
//        /**
//         * 访问非静态方法
//         */
//        Something object = new Something(new Date());
//        functionISomething = object::endWith;
//        System.out.println(functionISomething.invoke("你好呀"));
//
//        /**
//         * 访问构造函数
//         */
//        FunctionISomething<Date, Something> dateSomethingFunctionISomething = Something::new;
//        Something invoke = dateSomethingFunctionISomething.invoke(new Date());
//        System.out.println(invoke);
    }
}
