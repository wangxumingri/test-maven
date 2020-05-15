package com.example.demo.learnlambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @package: com.example.demo.learnlambda
 * @author: JQWang
 * @description:
 * @version: 1.0.0
 * @since: 1.0.0
 */
public class SortClient {

    public static void main(String[] args) {
        List<User> list1 = new ArrayList<>();
        list1.add(new User("甲",20,3000));
        list1.add(new User("甲",20,1000));
        list1.add(new User("乙",30,6000));
        list1.add(new User("丙",21,1000));
        list1.add(new User("丙",21,6000));
        list1.add(new User("丁",4,10000));
        list1.add(new User("丁",4,10000));

        System.out.println("排序前:");
        list1.forEach(System.out::println);

        // 根据年龄降序：后者-前者
        System.out.println("根据年龄降序:");
        list1.stream()
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .forEach(System.out::println);
        // 根据年龄升序：前者-后者
        System.out.println("根据年龄升序:");
        list1.stream()
                .sorted((o1, o2) -> o1.getAge() - o2.getAge())
                .forEach(System.out::println);
        // 先安装年龄高者排序，年龄相同时，根据薪资降序
        System.out.println("先安装年龄高者排序，年龄相同时，根据薪资降序:");
        list1.stream()
                .sorted((o1, o2) -> {
                    int r  = o2.getAge() - o1.getAge();
                    if (r == 0){
                        r = o2.getSalary()-o1.getSalary();
                    }
                    return r;
                })
                .forEach(System.out::println);

        System.out.println("-----------------------分割线-----------------------");

        System.out.println("先安装年龄高者排序，年龄相同时，根据薪资降序:");

        list1.stream().sorted().forEach(System.out::println);
    }
}
