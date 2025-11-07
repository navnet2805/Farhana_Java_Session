package String;

public class string_02 {

    public static void main(String[] args) {
        String s = "Java";
        System.out.println(s);
        String s1 = new String("Program");
        System.out.println(s1);
        String s2 = "Program";
        String s3 = "Java";
        String s4 = new String("Java");

        //.equals() ---> it will check the content
        System.out.println(s.equals(s4)); //t
        System.out.println(s4.equals(s3)); //t
        System.out.println(s1.equals(s4)); //f
        System.out.println(s.equals(s3)); //t
        System.out.println(s.equals(s2));

        //== ----> it will check the reference type/area
        System.out.println(s==s4);//f --> both are in different areas.
        System.out.println(s4==s3);//f
        System.out.println(s1==s4); //f
        System.out.println(s==s3); //t
        System.out.println(s==s2); //f
    }
}
