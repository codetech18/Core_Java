package Threads.Synchronization.Example1;

public class Main {
    public static void main(String[] args) {
        SynchronizedMethodE obj = new SynchronizedMethodE();
        Producer p = new Producer(obj);
        Consumer c = new Consumer(obj);
        p.start();
        c.start();
    }
}
