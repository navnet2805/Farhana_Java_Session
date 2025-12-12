package Collections;

import java.util.Iterator;
import java.util.TreeMap;

public class MapIterator {
    public static void main(String[] args) {
      TreeMap<Character,Integer> m  = new TreeMap();

      //insert
        m.put('c',1);
        m.put('f',3);
        m.put('h',5);

        //print the value
        System.out.println(m);
        System.out.println("=========================");
        //advance for loop
        for (Character f : m.keySet())
        {
            System.out.println(f);
        }

        System.out.println("=========================");
        //iterator
        Iterator<Character> it = m.keySet().iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }




    }
}
