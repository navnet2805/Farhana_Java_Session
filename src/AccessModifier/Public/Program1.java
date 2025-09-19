package AccessModifier.Public;

public class Program1 {


   static void m01()
    {
        System.out.println("from public Program1");
    }

    public static void main(String[] args) {
        int a = 10;
       Program1 obj = new Program1();
        System.out.println(a);
        obj.m01();

    }
}
