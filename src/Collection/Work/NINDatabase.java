package Collection.Work;

import java.util.HashSet;

import java.util.Iterator;
import java.util.Set;

public class NINDatabase {
    public static void main(String[] args) {
        NIN SAM = new NIN(234,"Ade");
        NIN BOSTON = new NIN(234,"Ade");
        NIN Georgia = new NIN(234,"Ade");
        HashSet<NIN> j= new HashSet<>();
       j.add(SAM);
       j.add(BOSTON);
       j.add(Georgia);

        System.out.println("The total number of NIN available now is: " +  0);

        Iterator iterator = j.iterator();
        while (iterator.hasNext()){

        }

    }
}
