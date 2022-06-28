package InnerClasses;

public class Static_Inner_Class {
    private String name = "John";
    private static int age = 23;

    static class staticClass{

        public void run(){
            System.out.println("My age is " + age);
        }
    }

    public static void main(String[] args) {
        Static_Inner_Class.staticClass run = new Static_Inner_Class.staticClass();
        run.run();
    }
}
