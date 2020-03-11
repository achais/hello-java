package com.achais.oo;

/**
 * 封装
 * 1. 良好的封装能够减少耦合。
 * 2. 类内部的结构可以自由修改。
 * 3. 可以对成员变量进行更精确的控制。
 * 4. 隐藏信息，实现细节。
 *
 * 坦白的说就是把属性设置为 private 然后暴露 getter 和 setter
 */
public class Encapsulation {
    private String name;
    private String idNum;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setIdNum(String newId) {
        idNum = newId;
    }
}
