package com.mycompany.workerthread;

class WorkerRunnable  extends Thread {
    @Override
    public void run(){
        System.out.println("Runnable dang chay");
    }
}