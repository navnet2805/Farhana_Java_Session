package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSet_01 {
    public static void main(String[] args) {

        Set a = new HashSet<>(); //syntax

        a.add(3);
        a.add(9);
        a.add(2);
        a.add('y');
        a.add("ku");
        a.add(1);
        a.add(null);//null
        a.add(3);//duplicate
        a.add(3);//duplicate
        a.add(3);//duplicate
        a.add(3);//duplicate
        a.add(3);//duplicate
        a.add("Java");
        a.add("Program");

        //to print all the elements in Array list
        System.out.println(a);

        //to print the only 1st element
        //System.out.println(a.get(0));

        //to print the length of array list
        System.out.println(a.size());

        //points to remember
        /*
        duplictes are allowed to add -> but only 1 copy will be stored in the Set.
        when multiple type of data is added to the Set order is not maintained
         */



    }
}
