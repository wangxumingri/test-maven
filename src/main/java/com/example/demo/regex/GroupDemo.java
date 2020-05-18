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
public class GroupDemo {

    /**
     * 隐式分组
     */
    @Test
    public void testImplicitGroup() {
        String source = "9999-10-31";
        String regex = "(\\d{4})-(\\d{2})-([0-9]{2})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(source);
        while (matcher.find()){
            System.out.println(matcher.group());
            System.out.println(matcher.groupCount());
            for (int i = 0; i <= matcher.groupCount(); i++) {
                System.out.println("第"+i+"个分组:"+matcher.group(i));
            }
        }
    }

    /**
     * 显示分组：
     *  使用?<name> 为分组命名
     */
    @Test
    public void testExplicitGroup() {
        String source = "9999-10-31";
        String regex = "(?<year>\\d{4})-(?<month>\\d{2})-(?<day>[0-9]{2})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(source);
        while (matcher.find()){
            System.out.println(matcher.groupCount());
            System.out.println("隐式分组:");
            for (int i = 0; i <= matcher.groupCount(); i++) {
                System.out.println("第"+i+"个分组:"+matcher.group(i));
            }
            System.out.println("显示分组:");
            System.out.println(matcher.group("year"));
            System.out.println(matcher.group("month"));
            System.out.println(matcher.group("day"));
        }
    }

    /**
     * 反向分组:不能和显式分组同时使用
     */
    @Test
    public void testReverseGroup() {
        String source = "9999-10-31";
        String regex = "(?<year>\\d{4})-(\\d{2})-([0-9]{2})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(source);
        while (matcher.find()){
            System.out.println(matcher.groupCount());
            for (int i = 0; i <= matcher.groupCount(); i++) {
                System.out.println("第"+i+"个分组:"+matcher.group(i));
            }
        }
    }


}
