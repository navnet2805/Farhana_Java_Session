package Collections;

import java.util.*;

public class Map {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap();
        //TreeMap<Character,Integer> map = new TreeMap(); //Sorted key value only in ascending order

        map.put('j',2);
        map.put('f',5);
        map.put('t',1);
        map.put('y',4);

        //printing all the values of map
        System.out.println(map);

        System.out.println("===================================");
        //print only the keys
       for (java.util.Map.Entry<Character,Integer> m : map.entrySet())
       {
           System.out.println(m.getKey()); //only keys
       }

        System.out.println("===================================");
        //print only the values
        for (java.util.Map.Entry<Character,Integer> m : map.entrySet())
        {
            System.out.println(m.getValue()); //only keys
        }

        System.out.println("===================================");
        //print only the key and value
        for (java.util.Map.Entry<Character,Integer> m : map.entrySet())
        {
            System.out.println(m.getKey() + "==" +m.getValue());
        }

        System.out.println("===================================");
        String s = "traffic";
        HashMap<Character,Integer> m = new HashMap<>(); //empty map

        for (char c : s.toCharArray())
        {
            int old = m.getOrDefault(c,0);
            m.put(c,old+1);
        }

    }
}
