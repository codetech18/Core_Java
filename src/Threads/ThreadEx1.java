package Threads;

public class ThreadEx1 implements Runnable{
    @Override
    public void run() {
        System.out.println("My thread is in running state");

        run2();
    }
    public void run2(){
        System.out.println("Family sh!t bruh!!!");
    }

    public static void main(String[] args) {
        ThreadEx1 obj = new ThreadEx1();
        Thread m = new Thread(obj);
        m.start();
    }
}
