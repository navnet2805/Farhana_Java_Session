package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_01 {
    public static void main(String[] args) {
        Set a = new TreeSet<>(); //syntax

       // a.add("ku");
        a.add(3);
        a.add(9);
        a.add(2);
        a.add(10);
        a.add(1);
        //a.add(null);//null -> it doesnt know how to sort it with integer
        a.add(3);//duplicate
        a.add(3);//duplicate
        a.add(3);//duplicate
        a.add(3);//duplicate
        a.add(3);//duplicate



        //to print all the elements in Array list
        System.out.println(a);

        //to print the only 1st element
        //System.out.println(a.get(0));

        //to print the length of array list
        System.out.println(a.size());

        /*
        In treeset -> insertion order is not maintained.
        -> each element should be of same data type.
        -> as soon as elements are inserted in Tree set - all the value will be sorted in ascending order.
         */

    }
}
