package Constructor;

// object creation.

public class Const2 {

    //attribute //features
    int a = 10;

    //actions
    public static void m02()
    {
        System.out.println("from method m02");
    }

    //actions
    public static void m03()
    {
        System.out.println("from method m03");
    }

    public static void main(String[] args) {
//        new Const2().m02();
//        new Const2().m03();
//        System.out.println(new Const2().a);

       Const2 obj = new Const2();
       System.out.println(obj.a);
       obj.m02();
       obj.m03();
    }
}
