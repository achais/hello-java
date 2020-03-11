package com.achais.basic;

/**
 * 方法
 */
public class Methods {
    public static void main(String[] args) {
        System.out.println();
    }

    /**
     * 方法头: 修饰符, 返回类型, 方法名, 参数类型, 参数值
     * 方法体: ...
     *
     * @param num1
     * @param num2
     * @return
     */
    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;

        return result;
    }

    /**
     * 方法的重载: 就是说一个类的两个方法拥有相同的名字，但是有不同的参数列表。
     * @param num1
     * @param num2
     * @return
     */
    public static double max(double num1, double num2) {
        return Math.max(num1, num2);
    }

    /**
     * 命令行参数的使用
     * @param args
     */
    public static void myMain(String args[]){
        for(int i=0; i<args.length; i++){
            System.out.println("args[" + i + "]: " + args[i]);
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("我是终结代码, 做垃圾回收用的, 比jvm垃圾回收期还快");
    }
}
