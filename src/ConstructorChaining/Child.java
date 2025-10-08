package ConstructorChaining;

public class Child extends Parent {
    Child()
    {
        this(4);
        System.out.println("from default child");
    }

    Child(int a)
    {
        this(4,5);
        System.out.println("from child 1 param const");
    }

    Child(int a,int b)
    {
        super();
        System.out.println("from child 2 param const");
    }

    public static void main(String[] args) {
        new Child(); // creating an object
    }
}
