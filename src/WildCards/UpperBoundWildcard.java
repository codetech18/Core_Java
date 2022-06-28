package WildCards;

import java.util.Arrays;
import java.util.List;

public class UpperBoundWildcard {
    public static void main(String[] args) {
        //Upper Bounded Integer List
        List< Integer > intList = Arrays.asList(10, 20, 30, 40);
        //printing the sum of integer elements in list
        System.out.println("Total sum is:" + sum(intList));

        //Upper Bounded Double list
        List < Double > doubleList = Arrays.asList(13.2, 15.6, 9.7, 22.5);
        //printing the sum of double elements in list
        System.out.print("Total sum is: " + sum(doubleList));
    }

    private static double sum(List < ?extends Number > myList) {
        double sum = 0.0;
        for (Number iterator: myList) {
            sum = sum + iterator.doubleValue();
        }
        return sum;
    }
}










// The intList, doubleList are being passed to method sum which has a
// wildcard that extends Number. This means that list being passed can
// be of any field or subclass of that field. Here, Integer and Double are
// subclasses of class Number.