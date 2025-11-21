package ArrayProgram;

import java.util.Arrays;

public class Arrays_01 {
    public static void main(String[] args) {

        int b1 = 10;

        int[] a = {20,60,30,3,3}; //Array primitive data types

        System.out.println("unsorted");
        for (int b : a)
        {
            System.out.println(b);
        }
        System.out.println("=================");

        Arrays.sort(a);
        System.out.println("sorted");
        for (int b : a)
        {
            System.out.println(b);
        }
        System.out.println("=================");



    }
}
