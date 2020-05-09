package com.example.demo.learnlambda;

/**
 * @package: com.example.demo.learnlambda
 * @describe:  @FunctionalInterface 注解要求接口必须有且只有一个抽象方法
 * @author: JQWang
 * @date: 2020-04-27
 */
@FunctionalInterface
public interface FunctionISomething<P,R> {
    R invoke(P param);
}
