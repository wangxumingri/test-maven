package com.example.demo.learnlambda;

import java.util.Date;

/**
 * @package: com.example.demo.learnlambda
 * @describe:
 * @author: JQWang
 * @date: 2020-04-27
 */
class Something {
    private String name;
    private Integer value;
    private Date time;

    public Something() {

    }

    public Something(Date time) {
        this(null,null,time);
    }

    public Something(String name, Integer value) {
        this(name,value,null);
    }

    public Something(String name, Integer value, Date time) {
        this.name = name;
        this.value = value;
        this.time = time;
    }

    // static methods
    static String startsWith(String s) {
        return String.valueOf(s.charAt(0));
    }

    // object methods
    String endWith(String s) {
        return String.valueOf(s.charAt(s.length()-1));
    }

    void endWith() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}