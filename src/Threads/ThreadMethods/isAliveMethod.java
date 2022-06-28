package Threads.ThreadMethods;

public class isAliveMethod implements Runnable{
    Thread thread;

    isAliveMethod(){
        thread = new Thread(this,"ChildThread");
        System.out.println("Thread Created: " + thread);
        thread.start();;
    }

    @Override
    public void run() {
        try{
            for (int i = 1; i<=5; i++){
            Thread.sleep(100);
                System.out.println(thread + "loop: " + i);}
        }catch(InterruptedException e){
            System.out.println("Thread : " + thread + "interrupted");
        }
    }
}
