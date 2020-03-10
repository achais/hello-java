package com.achais.basic;

import java.util.Map;

/**
 * Number & Math 类
 * 装箱和拆箱
 * 这种由编译器特别支持的包装称为装箱，所以当内置数据类型被当作对象使用的时候，编译器会把内置类型装箱为包装类
 * 相似的，编译器也可以把一个对象拆箱为内置类型。Number 类属于 java.lang 包。
 */
public class NumberAndMath {
    public static void main(String[] args) {
        Integer x = 5;
        x = x + 10;
        System.out.println(x);

        System.out.println("90 度的正弦值：" + Math.sin(Math.PI/2));
        System.out.println("0度的余弦值：" + Math.cos(0));
        System.out.println("60度的正切值：" + Math.tan(Math.PI/3));
        System.out.println("1的反正切值： " + Math.atan(1));
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));
        System.out.println(Math.PI);

        System.out.println(x.floatValue());
        System.out.println(x.compareTo(9));
        System.out.println(x.equals(9));
        System.out.println(Float.valueOf(x));
        System.out.println(x.toString());
        System.out.println(Integer.parseInt("6"));
        System.out.println(Math.abs(-99));
        System.out.println(Math.ceil(78.8)); // 向上取整
        System.out.println(Math.floor(78.8)); // 向下取整
        System.out.println(Math.rint(78.8)); // 最近整数
        System.out.println(Math.round(78.8)); // 四舍五入
        System.out.println(Math.min(7, 88));
        System.out.println(Math.max(7, 88));
        System.out.println((int) (Math.random() * 10)); // 随机数
    }
}
