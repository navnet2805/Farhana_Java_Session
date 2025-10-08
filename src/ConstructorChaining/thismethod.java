package ConstructorChaining;

public class thismethod {

    thismethod()
    {
        this(3);
        System.out.println("default constructor");
    }

    thismethod(int a)
    {
        this(2,3);
        System.out.println("1 param integer constructor: "+a);
    }

    thismethod(int a, int b)
    {
        this('g');
        System.out.println("2 param constructor "+a+" , "+b);
    }


    thismethod(char c)
    {
        System.out.println("1 param char constructor: "+c);
    }

    public static void main(String[] args) {
        new thismethod();
//        new thismethod(4);
//        new thismethod(5,8);
//        new thismethod('f');
    }
}
