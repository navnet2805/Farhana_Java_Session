import java.util.HashSet;
import java.util.Set;

public class Sample {
    public static void main(String[] args) {
       String s = "JavaProgram";
       Set set = new HashSet();

      for (char c : s.toCharArray())
      {
          set.add(c);
      }

        System.out.println(set);


    }
}
