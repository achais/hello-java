package com.achais.basic.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f = new File("file.txt");
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.exists());
        System.out.println(f.isFile());
        System.out.println(f.length());

        if (f.exists()) f.delete();

        if (f.createNewFile()) {
            System.out.println("进入了if操作");
            System.out.println(f.length());
            if (f.delete()) {
                System.out.println("操作完成");
            }
        }

        File file = File.createTempFile("temp-", ".txt");
        file.deleteOnExit();
        System.out.println(file.isFile());
        System.out.println(file.getAbsolutePath());
    }
}
