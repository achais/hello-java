package com.achais.basic;

/**
 * 变量类型
 * 类变量: 独立于方法之外的变量, 用 static 修饰
 * 实例变量: 独立于方法之外的变量, 不过没有用 static 修饰
 * 局部变量: 类的方法中的变量
 */
public class VariableTypes {
    int i; // 声明一个int型的变量i
    int ii = 100; // 声明并赋予初始值

    static int allClicks = 100; // 类变量

    String str = "hello"; // 实例变量

    public void main() {
        int i = 0; // 局部变量
    }

}
