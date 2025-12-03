package Exception;

public class numberFormatException {
    public static void main(String[] args) {
        String s = "2r";
        System.out.println(s+1);
        System.out.println(Integer.parseInt(s)+1);
    }
}
