package String;

public class String_toCharArray {

    public static void main(String[] args) {
        String s = "Java";

      char[] arr = s.toCharArray(); //{'J','a','v','a'}

//        for (int i=0 ;i<arr.length ; i++)
//        {
//            System.out.println(arr[i]);
//        }

        for (char c : arr )
        {
            System.out.println(c);
        }
    }
}
