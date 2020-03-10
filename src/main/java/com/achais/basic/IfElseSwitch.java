package com.achais.basic;

/**
 * 条件结构
 */
public class IfElseSwitch {
    public static void main(String[] args) {
        short age = 34;
        if (age > 60) {
            System.out.println("退休金多少?");
        } else if (age > 30) {
            System.out.println("孩子多大啦?");
        }else {
            System.out.println("有没有女朋友?");
        }

        switch (age) {
            case 30:
                System.out.println("孩子多大啦?");
                break;
            default:
                System.out.println("吃过了吗?");
                break;
        }
    }
}
