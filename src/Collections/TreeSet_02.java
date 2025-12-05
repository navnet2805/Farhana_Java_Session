package Collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_02 {
    public static void main(String[] args) {
        Set s = new TreeSet();

        //this will be sorted
//        s.add(3);
//        s.add(2);
//        s.add(1);

        //it will not sort -> it is string and it doesnt have number
//        s.add("Java");
//        s.add("Program");
//        s.add("java");

//        s.add("a1"); // it has number
//        s.add("au8"); //it has number
//        s.add("ao4"); //it has number

        s.add('d'); // asci value
        s.add('c'); // ascii
        s.add('a'); // ascii
        s.add('A'); //ascii
        System.out.println(s);
    }
}
