package com.achais.basic;

/**
 * 对象和类
 */
public class ObjectAndClass {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 要不要都行,Java编译器会提供一个默认构造方法
    public ObjectAndClass() {
    }

    public ObjectAndClass(String name) {
        System.out.println("老哥, 我要开始构造了");
        this.setName(name);
    }

    public void say() {
        System.out.println("老哥, 容我说句话");
        System.out.println("我叫 " + this.getName());
    }

    public static void main(String[] args) {
        ObjectAndClass obj = new ObjectAndClass("achais");
        obj.say();
        System.out.println("巴巴, 我要改名叫彭于晏");
        obj.setName("彭于晏");
        obj.say();
    }
}
