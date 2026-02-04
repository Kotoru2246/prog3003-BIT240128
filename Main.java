package com.mycompany.workerthread;

public class Main{
    public static void main(String[] args) {
        WorkerThread t1 = new WorkerThread();
        WorkerRunnable t2 = new WorkerRunnable();
        
        t1.start();
        t2.start();
        
        System.out.println("Done!");
    }
}