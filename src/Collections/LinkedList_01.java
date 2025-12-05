package Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_01 {
    public static void main(String[] args) {
        List a = new LinkedList<>();

        a.add(3);
        a.add(9);
        a.add(2);
        a.add(1);
        a.add(2,10);
        a.add(null);//null
        a.add(3);//duplicate




        //to print all the elements in Array list
        System.out.println(a);

        //to print the only 1st element
        System.out.println(a.get(0));

        //to print the length of array list
        System.out.println(a.size());
    }
}
