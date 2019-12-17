package com.company;

public class MyThread extends Thread {
    private String message;
    boolean flag=true;
    MyThread(String m) {
        this.message=m;
    }

    public void run() {
        while(true){
            Main.test(message);
        }
    }
}
