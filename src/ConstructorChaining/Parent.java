package ConstructorChaining;

public class Parent {

    Parent()
    {
        this(2,3);
        System.out.println("from default parent");
    }

    Parent(int a)
    {
        System.out.println("from parent 1 param const");
    }

    Parent(int a,int b)
    {
        this(4);
        System.out.println("from parent 2 param const");
    }
}

/*
from parent 1 param const
from parent 2 param const
 */
