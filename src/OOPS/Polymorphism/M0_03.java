package OOPS.Polymorphism;

public class M0_03 {
    public static void sum(int a , int b, int c)
    {
        System.out.println(a+b+c);
    }

    public static void sum(double a , int b)//typecasted form int to double
    {
        System.out.println(a+b);
    }

    public static void sum(int a , int b)
    {
        System.out.println(a+b);
    }

    public static void sum(int a , int b, int c,int d)
    {
        System.out.println(a+b+c+d);
    }

    public static void main(String[] args) {
        sum(2,3,5);
        sum(2,3);
        sum(1,2,3,4);
    }
}
