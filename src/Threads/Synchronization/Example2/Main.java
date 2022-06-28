package Threads.Synchronization.Example2;

public class Main {
    public static void main(String[] args) {
        SynchronizedMethod obj = new SynchronizedMethod();
        Producer p = new Producer(obj);
        Consumer c = new Consumer(obj);

        p.run();
        c.run();
    }
}
