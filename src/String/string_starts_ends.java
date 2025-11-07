package String;

public class string_starts_ends {
    public static void main(String[] args) {
        String s = "Java";

        System.out.println(s.startsWith("J"));//true
        System.out.println(s.startsWith("j"));//false

        System.out.println(s.endsWith("J"));//false
        System.out.println(s.endsWith("a"));//true
    }

}
