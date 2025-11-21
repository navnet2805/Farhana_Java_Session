package ArrayProgram;

import java.util.Arrays;

public class array_02 {

    public static void main(String[] args) {
        int[] a = {33,20,3,6,8,22,2,10,5,55,99};

        //first element
        System.out.println("first element: " +a[0]);

        //last element
        System.out.println("last element: " +a[a.length-1]);

        //Sort the array
        Arrays.sort(a); //sorted

        //smallest element
        System.out.println("smallest element: " +a[0]);

        //largest element
        System.out.println("largest element: " +a[a.length-1]);
    }
}
