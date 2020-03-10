package com.achais.basic;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期
 */
public class DateTimeClass {
    public static void main(String[] args) {
        Date date = new Date();
        Date date1 = new Date();

        // 时间格式化编码
        // https://www.runoob.com/java/java-date-time.html
        System.out.println(date.toString());
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(ft.format(date));

        System.out.println(String.format("%tT", date));

        System.out.println(date.equals(date1));

        System.out.println(date.getTime());
        date1.setTime(1583830900632L);
        System.out.println(date1.getTime());

        System.out.println(date.hashCode());
        System.out.println(date1.hashCode());
    }
}
