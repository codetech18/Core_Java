package Threads.ThreadMethods;

public class JoinMain {
    public static void main(String[] args) {

        JoinMethod obj = new JoinMethod();
        System.out.println(obj.thread + "is alive? : " + obj.thread.isAlive());
        try {
            System.out.println("Main thread is waiting for child thread to finish");
            obj.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");

        }

        System.out.println(obj.thread + " is alive? : " + obj.thread.isAlive());
        System.out.println("Main thread is exiting");
    }
}
