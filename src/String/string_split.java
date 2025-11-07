package String;

public class string_split {
    public static void main(String[] args) {
        String s = "Java is a programming language";
      String[]  arr = s.split(" "); //{"Java","is","a","programming","language"}

        //to print
        for (int i=0 ; i<arr.length ; i++)
        {
            System.out.println(arr[i]);
        }


        //advance for loop
        for(String d : arr )
        {
            System.out.println(d);
        }
    }
}
