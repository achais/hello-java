package com.achais.basic;

/**
 * StringBuffer 和 StringBuilder
 * StringBuffer线程安全, StringBuilder非线程安全
 */
public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello world");
        System.out.println(sb.append(0)); // 追加内容
        System.out.println(sb.reverse()); // 反转字符串
        System.out.println(sb.insert(0, "gogogo")); // 插入
        System.out.println(sb.replace(0, 6, "开心呀")); // 替换
        System.out.println(sb.capacity()); // 当前容量
        System.out.println(sb.substring(0, 4)); // 截取
    }
}
