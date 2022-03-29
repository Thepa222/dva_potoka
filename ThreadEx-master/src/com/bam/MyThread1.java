package com.bam;

import java.util.Random;

public class MyThread1 extends Thread{

    private final Buffer __buffer;
    private int n;

    public MyThread1(Buffer buffer, int n)
    {

        __buffer = buffer;
        this.n = n;
    }


    /**
     * Главный метод потока. Запускается при вызове start
     */
    @Override
    public void run() {

        try {

            method();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    /**
     *Бесконечно генерирует рандомные числа и добавляет их в буфер.
     */
    private void method() throws InterruptedException {


        while (true)
        {
            int i = new Random().nextInt(100);
            if((i%n==0) && (i!=0)){
                __buffer.add(i);
            }
            


        }


    }
}
