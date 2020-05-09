package com.example.demo.learnlambda;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

/**
 * @package: com.example.demo.learnlambda
 * @describe:
 * @author: JQWang
 * @date: 2020-04-27
 */
public class Client2 {
    private static final List<Something> root = new ArrayList<>();
    {
        root.add(new Something("1",1,new Date()));
        root.add(new Something("2",2,new Date()));
        root.add(new Something("3",3,new Date()));
        root.add(new Something("4",4,new Date()));
    }
    public static void main(String[] args) {
        Stream<Something> stream = root.stream();
    }
}
