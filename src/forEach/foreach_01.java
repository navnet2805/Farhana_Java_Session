package forEach;

public class foreach_01 {
    public static void main(String[] args) {

        System.out.println("==========================");

        int a = 10; //a has only 1 value
        int[] a1 = {10,2,4,6,9}; //a1 has multi values
        String s = "Java"; // s has mutli value {'j','a','v','a'}

        /* not possible
        for (int r : a)
        {
            System.out.println(r);
        }
         */


        for (int r : a1) // 10,2,4,6,9
        {
            System.out.println(r);
        }

        System.out.println("==========================");

        for (char r : s.toCharArray()) // {'j','a','v','a'}
        {
            System.out.println(r);
        }

        /*
        Synatx:
        for(LHS : RHS)
        {
           //statement
           //RHS: it should have the list of data || it should not have single value/data
           //LHS: the type of data/value
        }
         */



    }
}
