package Generics;

public class GenericDemo{
    public <M> M display (M val){
        return val;
    }

    public static void main(String[] args) {

        GenericDemo Gdi = new GenericDemo();

        System.out.println("String: " + Gdi.display("John"));
        System.out.println("Integer: " + Gdi.display(10));
    }

}
