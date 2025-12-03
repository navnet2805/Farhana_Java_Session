package Exception;

public class Exc_02 {

    public static void m(int a) throws ArithmeticException
    {
        System.out.println(a/0);
    }

    public static void main(String[] args) {
        int a = 10;
        m(a);
    }
}
