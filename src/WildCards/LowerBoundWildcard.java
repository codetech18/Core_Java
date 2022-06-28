package WildCards;

import java.util.Arrays;
import java.util.List;

public class LowerBoundWildcard {
    public static void main(String[] args) {
        //Lower Bounded Integer List
        List< Integer > intList = Arrays.asList(10, 20, 30, 40);
        //Passing Integer list object
        printOnlyIntegerClassorSuperClass(intList);

        //Number list
        List < Number > numberList = Arrays.asList(10, 20, 30, 40);
        //Passing Integer list object
        printOnlyIntegerClassorSuperClass(numberList);
    }
    public static void printOnlyIntegerClassorSuperClass(List < ?super Integer > list) {
        System.out.println(list);
    }
}














// Here arguments can be Integer or superclass of Integer(which is Number).
// The method printOnlyIntegerClassorSuperClass will only take Integer or
// its superclass objects. However, if we pass a list of types Double then we
// will get a compilation error. It is because only the Integer field or its superclass
// can be passed. Double is not the superclass of Integer.