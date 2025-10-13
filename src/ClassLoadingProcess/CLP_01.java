package ClassLoadingProcess;

public class CLP_01 {

    CLP_01()
    {
        System.out.println("from constructor");
    }
    //members of a class: variables , blocks and methods

    //Static members
    //1. Static variable
    static int a = 10;

    //2.Static blocks
    static
    {
        System.out.println("from a static block");
    }

    //3.Static methods
    public static void smethod()
    {
        System.out.println("from static method");
    }

    //Non-Static members
    //1. Non-Static variable
     int b = 20;

    //2.Non-Static blocks
    {
        System.out.println("from a non static block");
    }

    //3.Non-Static methods
    public void nsmethod()
    {
        System.out.println("from a non static method");
    }

    public static void main(String[] args) {
      CLP_01 obj = new CLP_01();
      obj.nsmethod();
      obj.smethod();
      CLP_01 obj1 = new CLP_01();

    }

}
