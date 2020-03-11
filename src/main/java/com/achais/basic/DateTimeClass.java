package com.achais.basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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

        // 休眠
        try {
            long start = System.currentTimeMillis( );
            System.out.println(new Date( ) + "\n");
            Thread.sleep(1000);
            System.out.println(new Date( ) + "\n");
            long end = System.currentTimeMillis( );
            long diff = end - start;
            System.out.println("Difference is : " + diff);
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }

        // Calendar类
        Calendar c1 = Calendar.getInstance();
        c1.set(2020, Calendar.MARCH, 11);
        System.out.println(c1.get(Calendar.DAY_OF_WEEK));

        GregorianCalendar c2 = new GregorianCalendar();
        System.out.println(c2.get(Calendar.DAY_OF_WEEK));
    }
}
