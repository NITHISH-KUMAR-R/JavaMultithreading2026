package com.java;


class SampleThread extends Thread{

    public void run(){
        System.out.println("Sample Thread is running");
    }
}


class SampleThread2 implements  Runnable{
    @Override
    public void run() {
        System.out.println("Sample Thread 2 is running using runnable");
    }
}
public class BasicThread {

    public static  void main(String a[]){
        System.out.println("Hello Java Learning Multithreading 2026");

        SampleThread t1 = new SampleThread();
        t1.start();

        SampleThread2 t2 = new SampleThread2();
       // t2.run();
        new Thread(t2).start();


    }
}
