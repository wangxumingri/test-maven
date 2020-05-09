package com.example.demo;

import com.example.demo.eight.TestService;
import com.example.demo.eight.TestServiceImpl;
import com.example.demo.learnlambda.FunctionISomething;
import org.junit.jupiter.api.Test;

/**
 * @package: com.example.demo
 * @author: JQWang
 * @description:
 * @version: 1.0.0
 * @since: 1.0.0
 */

public class TestEight {

    @Test
    public void testDefaultMethod(){
        TestService testService = new TestServiceImpl();
        testService.show();
        testService.print("111");
        System.out.println(testService.a);
        TestServiceImpl testService1 = new TestServiceImpl();
        System.out.println(testService1.a);

    }

    @Test
    public void testLambda1(){
        int num = 5;
        FunctionISomething<Integer,String> functionISomething = (param)-> {
            return String.valueOf(param+num);
        };

        String invoke = functionISomething.invoke(3);

        System.out.println(invoke);
    }
}
