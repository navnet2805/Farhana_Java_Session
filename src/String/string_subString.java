package String;

public class string_subString {

    public static void main(String[] args) {
        String s = "Java programming";
        System.out.println(s.substring(5)); //give the index

        System.out.println(s.substring(0,3)); //end index will be skipped. it will always consider end index-1
    }
}
