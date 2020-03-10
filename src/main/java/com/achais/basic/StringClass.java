package com.achais.basic;

/**
 * String 类
 */
public class StringClass {
    public static void main(String[] args) {
        String greeting = "起风博客";

        char[] helloArray = { 'a', 'c', 'h', 'a', 'i', 's'};
        String helloString = new String(helloArray);
        System.out.println( helloString );

        greeting = "gogoing";
        System.out.println(greeting);

        String site = "https://www.achais.com";
        System.out.println(site.length());

        System.out.println(site.concat("!!!"));

        // 格式化字符串
        String name = "achais";
        Integer age = 25;
        System.out.printf("my name is %s, %d years old.\r\n", name, age);
        String fs = String.format("my name is %s, %d years old.", name, age);
        System.out.println(fs);

        String flag = "hello world";
        System.out.println(flag.charAt(0));
        System.out.println(flag.compareTo("hello world"));
        System.out.println(flag.compareToIgnoreCase("HELLO WORLD"));
        System.out.println(flag.concat(" achais"));
        System.out.println(flag.endsWith("world"));
        System.out.println(flag.startsWith("hello"));
        System.out.println(flag.hashCode());
    }
}
