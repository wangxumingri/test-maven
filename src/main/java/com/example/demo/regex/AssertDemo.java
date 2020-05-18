package com.example.demo.regex;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @package: com.example.demo.regex
 * @author: JQWang
 * @description:
 * @version: 1.0.0
 * @since: 1.0.0
 */
public class AssertDemo {

    private  String source = "Learn Git and GitHub without GitHub any code";

    /**
     * 正向先行断言：获取pattern之前的内容
     * 获取without之前的字符串 : Learn Git and GitHub
     */
    @Test
    public void testBefore() {
        String regex = ".+(?=without)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(source);
        System.out.println("匹配结果:");
        while (matcher.find()) {
            String result = matcher.group();
            System.out.println(result+"\t 长度:"+result.length());
        }
    }

    /**
     * 正向后行断言：获取pattern之后的内容
     * 获取without之后的字符串
     */
    @Test
    public void testAfter() {
        String regex = "(?<=without).*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(source);
        System.out.println("匹配结果:");
        while (matcher.find()) {
            String result = matcher.group();
            System.out.println( (result == null || "".equals(result.trim())  ? "空字符串" :result) +"\t 长度:"+result.length());
        }
    }

    /**
     * 负向先行断言：(?!pattern) 获取非pattern之前的内容
     * 获取without之后的字符串
     */
    @Test
    public void testNegativeBefore() {
        String regex = "GitHub(?!without)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(source);
        System.out.println("匹配结果:");
        while (matcher.find()) {
            String result = matcher.group();
            System.out.println( (result) +"\t 长度:"+result.length());
        }
    }

    /**
     * 负向后行断言：(?<!pattern) 获取非pattern之后的内容
     * 获取without之后的字符串
     */
    @Test
    public void testNegativeAfter() {
        String regex = "(?<=without).*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(source);
        System.out.println("匹配结果:");
        while (matcher.find()) {
            String result = matcher.group();
            System.out.println( (result == null || "".equals(result.trim())  ? "空字符串" :result) +"\t 长度:"+result.length());
        }
    }



}
