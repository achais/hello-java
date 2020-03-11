package com.achais.oo;

class Animal {
    private String name;
    private int age;

    public Animal(String myName, int age) {
        this.name = myName;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + "正在吃东西");
        //吃东西方法的具体实现
    }

    public void sleep() {
        System.out.println(name + "正在睡觉zZ");
        //睡觉方法的具体实现
    }

    public void intro() {
        System.out.println(name + "今年" + age + "岁了");
    }
}

class People extends Animal {
    People(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("嘤嘤嘤");
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("汪汪汪");
    }
}

interface A {
    public void eat();

    public void sleep();
}

interface B {
    public void show();
}

class C implements A, B {
    public void eat() {
    }

    public void sleep() {
    }

    public void show() {
    }
}

/**
 * 继承
 */
public class Inheritance {
    public static void main(String[] args) {
        People people = new People("才哥", 25);
        Dog dog = new Dog("李白", 4);

        people.eat();
        people.sleep();
        people.intro();

        dog.eat();
        dog.sleep();
        dog.intro();
    }
}
