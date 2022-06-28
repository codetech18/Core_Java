package Generics;

public class GenericClassDemo<T> {
    private T t;
    private String name;

    public void setValue(T t){
        this.t = t;
    }
    public T getValue(){
        return t;
    }

    public static void main(String[] args) {
        GenericClassDemo<Integer> iobj = new GenericClassDemo<Integer>();
        iobj.setValue(10);
        System.out.println("Integer Object " + iobj.getValue());

        GenericClassDemo<String> sobj = new GenericClassDemo<>();
        sobj.setValue("Ten");
        System.out.println("String Object: " + sobj.getValue());
    }
}
