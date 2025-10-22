package ClassLoadingProcess;

public class CLP_01 {

    CLP_01()
    {
        this(4);
        System.out.println("from parent default constructor");
    }

    CLP_01(int a)
    {
        System.out.println("from parent 1 param constructor");
    }
    //members of a class: variables , blocks and methods

    //Static members
    //1. Static variable
    static int a = 10;

    //2.Static blocks
    static
    {
        System.out.println("from parent static block");
    }

    //3.Static methods
    public static void smethod()
    {
        System.out.println("from parent static method");
    }

    //Non-Static members
    //1. Non-Static variable
     int b = 20;

    //2.Non-Static blocks
    {
        System.out.println("from parent a non static block");
    }

    //3.Non-Static methods
    public void nsmethod()
    {
        System.out.println("from parent a non static method");
    }

    public static void main(String[] args) {
      CLP_01 obj = new CLP_01();
      obj.nsmethod();
      obj.smethod();

    }

}
