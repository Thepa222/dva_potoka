package com.bam;

public class Main {

    public static void main(String[] args) {


        // Создаем буфер
        Buffer _buffer = new Buffer();

        //Создаем потоки и передаем ссылку на буфер в их конструктор.
        MyThread1 _myThread1 = new MyThread1(_buffer, 7);
        MyThread2 _myThread2 = new MyThread2(_buffer);

        _myThread1.start();
        _myThread2.start();

    }
}
