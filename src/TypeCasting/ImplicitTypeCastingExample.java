package TypeCasting;

public class ImplicitTypeCastingExample {
    public static void main(String[] args) {
        int i = 200;

        //automatic type conversion to long
        long l = i;

        //automatic type conversion to float
        float f = l;
        System.out.println(i + " is of Type " + ((Object)i).getClass().getSimpleName());
    }
}
