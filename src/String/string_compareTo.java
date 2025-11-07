package String;

public class string_compareTo {
    public static void main(String[] args) {
        String s = "Java";
        String s1= "python";
        String s2 = "Java";
        String s3 = "java";

        System.out.println(s.compareTo(s1));
        System.out.println(s.compareTo(s2));
        System.out.println(s.compareTo(s3));
        System.out.println(s.compareToIgnoreCase(s3));
    }
}
