package InnerClasses;

public class MethodLocalInner_Class {
    private String x = "my outerclass ";

    void display(){
        final String z = "Local variable ";
        System.out.println("X: " + x);

        class Inner{
            public void print(){
                System.out.println("Will it print x?" + x);
                System.out.println("Will it print z?" + z);
            }
        }
            Inner run = new Inner();
            run.print();
    }

    public static void main(String[] args) {
        MethodLocalInner_Class Inner = new MethodLocalInner_Class();
        Inner.display() ;

    }
}


