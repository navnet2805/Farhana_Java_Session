package String;

public class string_replace {

    public static void main(String[] args) {
        String s = "Java";

        System.out.println(s.replace('a','j'));

        System.out.println(s.replaceFirst("a","v"));

        System.out.println(s.replaceAll(s,"program"));
    }
}
