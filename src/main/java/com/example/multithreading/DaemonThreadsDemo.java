package com.example.multithreading;

public class DaemonThreadsDemo extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 1; i <= 10; i++) {
            System.out.println("child");
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {}
        }
    }
}

class Test {
    public static void main(String[] args) {
        DaemonThreadsDemo dt = new DaemonThreadsDemo();
        dt.start();
        dt.isDaemon();
       // dt.setDaemon(true);
        dt.isDaemon();

        for (int i = 1; i <= 10; i++) {
            System.out.println("main");
        }
    }
}
