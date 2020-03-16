package com.achais.advances;

/**
 * 多线程
 * 一条线程指的是进程中一个单一顺序的控制流，一个进程中可以并发多个线程，每条线程并行执行不同的任务。
 */
public class Multithreading {
    public static void main(String[] args) throws InterruptedException {
        /*
        Thread t1 = new Thread(new YourJob("job1"));
        Thread t2 = new Thread(new YourJob("job2"));
        Thread t3 = new Thread(new YourJob("job3"));
        t1.start();
        t2.start();
        t3.start();
         */
        /*
        Thread t1 = new MyJob("job1");
        Thread t2 = new MyJob("job2");
        Thread t3 = new MyJob("job3");
        t1.start();
        t2.start();
        t3.start();
         */

        System.out.println("I am main thread.");
        Thread t = new Thread(()-> {
            System.out.println("I am new thread.");
            try {
                Thread.sleep(1000);
                // mmp, 我还没 over 你就结束进程
                System.out.println("Ok, new thread is over.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t.start();
        // 等待另外一个线程结束, 2秒, 超过不等
        t.join(2000);
        System.out.println("Main thread is over.");
        // 强制退出进程
        System.exit(0);
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
                    System.out.println("休息一下");
                    Thread.sleep(100);
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
