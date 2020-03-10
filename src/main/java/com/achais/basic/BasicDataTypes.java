package com.achais.basic;

/**
 * 基本数据类型: 八种基本类型
 */
public class BasicDataTypes {
    private byte myByte; // 字节, 8位
    private short myShort; // 16位
    private int myInt; // 32位
    private long myLong; // 64位
    private float myFloat; // 32位
    private double myDouble; // 64位
    private boolean myBoolean; // 布尔型
    private char myChar; // 字符型, 16位

    public static void dataTypes() {
        // byte
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
        System.out.println();

        // short
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
        System.out.println("包装类：java.lang.Short");
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
        System.out.println();

        // int
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
        System.out.println("包装类：java.lang.Integer");
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
        System.out.println();

        // long
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
        System.out.println();

        // float
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        System.out.println();

        // double
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
        System.out.println();

        // char
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        System.out.println("最小值：Character.MIN_VALUE=" + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值：Character.MAX_VALUE=" + (int) Character.MAX_VALUE);
    }

    public static void convert() {
        short sh = 128;
        int i = sh;
        double d = i;
        d += (float) 0.6;
        float f = (float) d;
        long l = (long) f;
        System.out.println(sh);
        System.out.println(i);
        System.out.println(d);
        System.out.println(f);
        System.out.println(l);

        byte b = (byte) i;
        System.out.println(b);

        System.out.println((int) 23.5 == 23);
        System.out.println((int) -23.5 == -23);

        char c1 = 'a';
        int i1 = c1;
        char c2 = (char) (i1 + 2);
        System.out.println(i1);
        System.out.println(c2);
        System.out.println((char) (c2 - 32));

    }

    public static void main(String[] args) {
        byte by = 123;
        // 溢出只会保留低位
        by = (byte) 200;
        // 正数的原码反码补码都相同,负数的反码为符号位不变其他位与绝对值取反, 负数的补码为其反码+1
        int i = by;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(200));
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Float.toHexString(100f));
    }
}
