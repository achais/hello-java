package com.achais.basic;

import java.io.*;

/**
 * 流(Stream),文件(File), IO
 */
public class FilesIO {
    public static void main(String[] args) throws IOException {
        File f = new File("a.txt");
        FileOutputStream fop = new FileOutputStream(f);
        // 构建FileOutputStream对象,文件不存在会自动新建

        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
        // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk

        writer.append("中文输入");
        // 写入到缓冲区

        writer.append("\r\n");
        // 换行

        writer.append("English");
        // 刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入

        writer.close();
        // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉

        fop.close();
        // 关闭输出流,释放系统资源

        FileInputStream fip = new FileInputStream(f);
        // 构建FileInputStream对象

        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
        // 构建InputStreamReader对象,编码与写入相同

        StringBuilder sb = new StringBuilder();
        while (reader.ready()) {
            sb.append((char) reader.read());
            // 转成char加到StringBuffer对象中
        }
        System.out.println(sb.toString());
        reader.close();
        // 关闭读取流

        fip.close();
        // 关闭输入流,释放系统资源
    }

    public static void fileInputStream() throws IOException {
        InputStream inputStream = new FileInputStream("a.txt");
        inputStream.close();
    }

    public static void fileOutputStream() throws IOException {
        String str = "hello world";
        OutputStream outputStream = new FileOutputStream("a.txt");
        outputStream.write(str.getBytes());
        outputStream.close();
        System.out.println("success");
    }

    public static void bufferedReader() throws IOException {
        char c;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
