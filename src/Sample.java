import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Sample {
    public static void main(String[] args) {
       String s = "traffic";
       HashMap<Character,Integer> m = new HashMap<>(); //empty map

       for (char c : s.toCharArray())
       {
           int old = m.getOrDefault(c,0);
           m.put(c,old+1);
       }

       //onlu unique character
        for (java.util.Map.Entry<Character,Integer> map : m.entrySet())
        {
            if (map.getValue()==1)
                System.out.println(map.getKey());
        }



    }
}
