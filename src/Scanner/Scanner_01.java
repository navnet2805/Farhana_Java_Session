package Scanner;

import java.util.Scanner;

public class Scanner_01 {

    public static void main(String[] args) {
        //int a = 10;

        //scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer value: ");
        int a = sc.nextInt();
        System.out.println(a);

        System.out.print("Enter any name: ");
        String s = sc.next();
        System.out.println("The name received by user is: "+s);


        int[] arr = new int[5];
        int y=0;
        for (int t : arr)
        {
            arr[y++] = sc.nextInt();
        }

        int z=0;
        System.out.print("the elements of the array are: ");
        for (int t : arr)
        {
            System.out.print(arr[z++]+"  ");
        }
    }
}
