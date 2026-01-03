package com.java;

class SampleThread extends Thread {

    @Override
    public void run() {
        System.out.println("Sample Thread is running");
    }
}

class SampleThread2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Sample Thread 2 is running using Runnable");
    }
}

public class BasicThread {

    public static void main(String[] args) {

        System.out.println("Hello Java Learning Multithreading 2026");

        // -----------------------------
        // NEW STATE
        // Thread object is created
        // No OS-level thread yet
        // -----------------------------
        SampleThread t1 = new SampleThread();

        // -----------------------------
        // RUNNABLE STATE
        // OS thread is created
        // Thread is ready to run
        // Waiting for CPU time (managed by OS scheduler)
        // JVM internally calls run()
        // -----------------------------
        t1.start();

        // -----------------------------
        // Runnable-based thread creation
        // Preferred approach
        // -----------------------------
        SampleThread2 t2 = new SampleThread2();
        Thread t3 = new Thread(t2);
        t3.start();

        // -----------------------------
        // NOTE:
        // Java does NOT have a separate RUNNING state
        // RUNNING is part of RUNNABLE internally
        // -----------------------------

        /*
         * WAITING STATE (indefinite wait)
         * - wait()
         * - join()
         * Thread does NOT consume CPU
         */

        /*
         * TIMED_WAITING STATE (fixed time wait)
         * - Thread.sleep(1000)
         * - wait(1000)
         * - join(1000)
         */

        // -----------------------------
        // TERMINATED STATE
        // run() method execution completed
        // Thread is dead
        // Cannot be restarted
        // -----------------------------

        /*
         * Calling start() again will throw:
         * IllegalThreadStateException
         *
         * Example (INVALID):
         * t1.start();  // ❌ Exception
         */
    }
}
