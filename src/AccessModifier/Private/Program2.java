package AccessModifier.Private;


public class Program2 {
    public static void m02()
    {
        System.out.println("from private Program2");
    }

    public static void main(String[] args) {
        int b = 10;
        System.out.println(b);
        m02();
        //m01();

    }
}
