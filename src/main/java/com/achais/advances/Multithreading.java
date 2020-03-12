package com.achais.advances;

/**
 * 多线程
 * 一条线程指的是进程中一个单一顺序的控制流，一个进程中可以并发多个线程，每条线程并行执行不同的任务。
 */
public class Multithreading {
    public static void main(String[] args) {
        YourJob job1 = new YourJob("job1");
        YourJob job2 = new YourJob("job2");
        YourJob job3 = new YourJob("job3");
        job1.run();
        job2.run();
        job3.run();
    }
}

class MyJob extends Thread {
    private String name;

    MyJob(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.name + ": " + i);
            if (i % 5 == 0) {
                try {
                    this.wait(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class YourJob implements Runnable {
    private Thread t;
    private String name;

    YourJob(String name) {
        this.name = name;
    }

    public void start() {
        System.out.println("创建线程:" + name);
        if (t == null) {
            t = new Thread(this, name);
            t.start();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(this.name + ": " + i);
            if (i % 5 == 0) {
                try {
                    System.out.println("休息一下");
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
