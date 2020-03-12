package com.achais.advances;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 序列化
 */
public class Serialization {
    public static void main(String[] args) throws IOException {
        Employee e = new Employee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 11122333;
        e.number = 101;

        // 当对象被序列化时，属性 SSN 的值为 111222333，但是因为该属性是短暂的，该值没有被发送到输出流
        // 所以反序列化后 Employee 对象的 SSN 属性为 0。
        try {
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}

/**
 * 请注意，一个类的对象要想序列化成功，必须满足两个条件：
 * <p>
 * 该类必须实现 java.io.Serializable 接口。
 * <p>
 * 该类的所有属性必须是可序列化的。如果有一个属性不是可序列化的，则该属性必须注明是短暂的。
 * <p>
 * 如果你想知道一个 Java 标准类是否是可序列化的，请查看该类的文档。检验一个类的实例是否能序列化十分简单， 只需要查看该类有没有实现 java.io.Serializable接口。
 */
class Employee implements java.io.Serializable {
    public String name;
    public String address;
    public transient int SSN; // 注明短暂的, 不参与序列化
    public int number;

    public void mailCheck() {
        System.out.println("Mailing a check to " + name
                + " " + address);
    }
}