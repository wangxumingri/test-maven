package com.example.demo.eight;

/**
 * @package: com.example.demo.eight
 * @author: JQWang
 * @description:
 * @version: 1.0.0
 * @since: 1.0.0
 */
public interface TestService {
     int a = 3;

    /**
     * 需要实现类实现的抽象方法
     * @param content
     */
    void print(String content);

    /**
     * 可被实现类重写的有方法体的默认方法
     */
    default void show(){
        System.out.println("hello world");
    }
}
