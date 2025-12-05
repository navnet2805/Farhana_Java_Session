package Collections;

import java.util.List;

public class List_01 {

    public static void main(String[] args) {
        List k = List.of("java",10,3.00,'g');

        //printing complete list
        System.out.println(k);
        System.out.println("=======================");

        //print every content from the list
        for (Object u : k)
        {
            System.out.println(u);
        }

        //in the list index is not supported
//        for (int i=0; i<k.size() ; i++)
//        {
//            System.out.println(k[i]);
//        }
    }
}
