package Threads.ThreadMethods;

public class PriorityMethodMain {
    public static void main(String[] args) {

        PriorityMethod obj1 = new PriorityMethod(Thread.NORM_PRIORITY - 2);
        PriorityMethod obj2 = new PriorityMethod(Thread.NORM_PRIORITY + 2);
        PriorityMethod obj3 = new PriorityMethod(Thread.NORM_PRIORITY + 3);

        obj1.thread.start();
        obj2.thread.start();
        obj3.thread.start();

        try{
            System.out.println("Main thread for child thread to finish");
            obj1.thread.join();
            obj2.thread.join();
            obj3.thread.join();
        }catch(InterruptedException e){
            System.out.println("Main thread Interrupted");
        }
        System.out.println(obj1.thread + "is alive? : " + obj1.thread.isAlive());
        System.out.println(obj2.thread + "is alive? : " + obj2.thread.isAlive());
        System.out.println(obj3.thread + "is alive? : " + obj3.thread.isAlive());
        System.out.println("Main thread is exiting");
    }
}
