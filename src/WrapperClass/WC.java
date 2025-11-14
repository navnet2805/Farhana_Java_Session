package WrapperClass;

public class WC {
    //int,byte,char.....
    public static void main(String[] args) {
        char c = '1';
        System.out.println(Character.isAlphabetic(c));
        //logic 1
        Character c1 = c;
        System.out.println(c1.toString().toUpperCase());

        //logic 2
        Character d = 'g';
        System.out.println(Character.toUpperCase(c)); //G

        int a = 10;
        Integer b = 10;

        //scenario
        String s = "10g";
        s = s.replace("g","");
        Integer a1 = Integer.parseInt(s);
        int i = 2;
        System.out.println(a1+i);






    }
}
