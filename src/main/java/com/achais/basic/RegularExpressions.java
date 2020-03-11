package com.achais.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式
 */
public class RegularExpressions {
    public static void main(String[] args) {
        String str = "this is text.";
        // Pattern 类
        String p = ".+is.+";
        boolean isMatch = Pattern.matches(p, str);
        System.out.println(isMatch);

        // 捕获组
        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println(m.groupCount());
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );
        } else {
            System.out.println("NO MATCH");
        }

    }
}
