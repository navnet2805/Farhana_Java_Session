package String;

public class string_contains {
    public static void main(String[] args) {
        String s = "Java";
        System.out.println(s.contains("vaaJ")); //false
        System.out.println(s.contains("ava")); //true
        System.out.println(s.contains("J")); //true
        System.out.println(s.contains("j")); //false
    }
}
