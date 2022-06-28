package Threads.ThreadMethods;

public class isAliveMain {
    public static void main(String[] args) {

        isAliveMethod obj = new isAliveMethod();
        System.out.println(obj.thread + "is alive? : " + obj.thread.isAlive());
        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(200);
                System.out.println("Main Thread loop: " + i);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }
        System.out.println(obj.thread + " is alive? : " + obj.thread.isAlive());
        System.out.println("Main thread is exiting");
    }
}