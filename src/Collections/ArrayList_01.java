package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayList_01 {
    public static void main(String[] args) {

       List a = new ArrayList(); //syntax for Array List
        //List<Integer> a = new ArrayList<>(); //this will accept only integer type of data
        a.add("Java"); //string
        a.add(10); //int
        a.add('f'); //char
        a.add(null); //null
        a.add(10); //duplicate
        a.add(23);
        a.add(0,7); //explicitly add value 7 as a 1st element



        //to print all the elements in Array list
        System.out.println(a);

        //to print the only 1st element
        System.out.println(a.get(0));

        //to print the length of array list
        System.out.println(a.size());


    }
}
