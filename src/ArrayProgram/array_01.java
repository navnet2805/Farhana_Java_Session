package ArrayProgram;

public class array_01 {

    public static void main(String[] args) {
        int a = 10;
        a = 20;
        a = 30;
        a = 40;

        int[] a1 = {10,20,30,40}; // values can be assigned directly

//        for (int i=0 ; i<a1.length ; i++)
//        {
//            System.out.println(a1[i]);
//        }

//        for (int u : a1)
//            System.out.println(u);


int count= 1;
        int[] a2 = new int[6]; //size is pre-defined

        String[] a4 = {"abc","hgi","kohhj"};
        String a5[] = new String[7];


//        for (int i=0 ; i<a2.length ; i++)
//        {
//           a2[i] = count++;
//            System.out.println(a2[i]);
//        }

        int[] a3 = new int[4];
        for (int i=0 ; i<=a3.length ; i++)
        {
            System.out.println(a3[i]);
        }


    }
}
