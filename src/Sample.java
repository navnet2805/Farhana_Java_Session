import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Sample {
    public static void main(String[] args) {
       int num1 = 0;
       int num2 = 1;
        System.out.print(num1 +" " +num2 + " ");
       for (int i=1 ; i<=12 ; i++)
       {
           int num3 = num1 + num2;
           num1 = num2;
           num2 = num3;
           System.out.print(num3 +" ");
       }


    }
}
