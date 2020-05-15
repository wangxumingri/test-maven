package com.example.demo.learnlambda;

import java.util.Date;

/**
 * @package: com.example.demo.learnlambda
 * @describe:
 * @author: JQWang
 * @date: 2020-04-27
 */
class User implements Comparable<User>{
    private String name;
    private Integer age;
    private Integer salary;

    public User(String name, Integer age, Integer salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(User o) {
        int r = o.getAge() - this.getAge();
        if (r == 0){
            r = o.getSalary() - this.getSalary() ;
        }
        return r;
    }
}