package com.achais.oo;

/**
 * 重写和重载
 * 重写: 子类继承父类时重写父类方法,返回类型,方法名,参数列表都不能改变(异常和访问权限可改)
 * 重载: 子类继承父类时重载父类方法,返回类型,方法名,参数列表都可以改变(就和没事人一样)
 */
public class OverrideAndOverload {
}

/**
 * 上个文件讲解继承的时候就已经用到重写了, 我重写了eat方法
 * 嘤嘤嘤和汪汪汪
 */

/**
 * 这是重载
 */
class Overloading {
    public int test(){
        System.out.println("test1");
        return 1;
    }

    public void test(int a){
        System.out.println("test2");
    }

    //以下两个参数类型顺序不同
    public String test(int a,String s){
        System.out.println("test3");
        return "returntest3";
    }

    public String test(String s,int a){
        System.out.println("test4");
        return "returntest4";
    }

    public static void main(String[] args){
        Overloading o = new Overloading();
        System.out.println(o.test());
        o.test(1);
        System.out.println(o.test(1,"test3"));
        System.out.println(o.test("test4",1));
    }
}