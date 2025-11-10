package String;

public class StringBuilder_01 {

    public static void main(String[] args) {
       StringBuffer sb =  new StringBuffer("Java");
        System.out.println(sb);
       sb.replace(0,1,"j");
        System.out.println(sb); //stringBuilder is mutable in nature

    }
}
