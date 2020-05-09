package com.example.demo.eight;

/**
 * @package: com.example.demo.eight
 * @author: JQWang
 * @description:
 * @version: 1.0.0
 * @since: 1.0.0
 */
public class TestServiceImpl implements TestService{
    public int a = 4;
    @Override
    public void print(String content) {
        System.out.println("实现类:"+content);
    }

    @Override
    public void show() {
        System.out.println("实现类重写接口默认方法");
    }
}
