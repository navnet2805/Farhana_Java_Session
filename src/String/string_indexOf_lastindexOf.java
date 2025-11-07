package String;

public class string_indexOf_lastindexOf {

    public static void main(String[] args) {
        String s = "Java";

        System.out.println(s.indexOf('v'));

        //-1 : character is not present
        System.out.println(s.indexOf('z'));

        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));

    }
}
