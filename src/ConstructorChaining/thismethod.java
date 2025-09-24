package ConstructorChaining;

public class thismethod {

    int a;
    char b;
    long c;

    thismethod()
    {
        this(4);
        System.out.println("from default");
    }

    thismethod(int a)
    {
        this('g');
        System.out.println("from a");
    }

    thismethod(char b)
    {
        this("Java");
        System.out.println("from b");
    }

    thismethod(String c)
    {
        System.out.println("from c");
    }


    public static void main(String[] args) {
        thismethod obj = new thismethod();


    }
}
