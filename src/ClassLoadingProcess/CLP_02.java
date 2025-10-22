package ClassLoadingProcess;

public class CLP_02 extends CLP_01 {

    CLP_02()
    {
        this(4);
        System.out.println("from child default constructor");
    }

    CLP_02(int a)
    {
        System.out.println("from child 1 param constructor");
    }
    //members of a class: variables , blocks and methods

    //Static members
    //1. Static variable
    static int c = 40;

    //2.Static blocks
    static
    {
        System.out.println("from child static block");
    }

    //3.Static methods
    public static void s_c_method()
    {
        System.out.println("from child static method");
    }

    //Non-Static members
    //1. Non-Static variable
    int d = 70;

    //2.Non-Static blocks
    {
        System.out.println("from child a non static block");
    }

    //3.Non-Static methods
    public void ns_c_method()
    {
        System.out.println("from child a non static method");
    }

    public static void main(String[] args) {
      CLP_02 obj = new CLP_02();

      //static member
        System.out.println(c);  //directly
        System.out.println(obj.c); //from object reference
        System.out.println(CLP_02.c); //from class name
        s_c_method();
        obj.s_c_method();
        CLP_02.s_c_method();
        //System.out.println(a);
        //smethod();


        //non-static members
        System.out.println(obj.d);
        obj.ns_c_method();

        //from parent
        //obj.nsmethod();
        //System.out.println(obj.b);

    }
}
