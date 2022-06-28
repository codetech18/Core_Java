package Threads.ThreadMethods;

public class PriorityMethod implements Runnable {
    Thread thread;

    PriorityMethod(int Priority) {
        thread = new Thread(this, "ChildThread");
        thread.setPriority(Priority);
        System.out.println("Thread Created: " + thread);
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(500);
                System.out.println(thread + "loop: " + i);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread : " + thread + "interrupted");
        }
    }
}

