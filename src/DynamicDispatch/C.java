package DynamicDispatch;

public class C extends P {

    static  int c = 30;

    static {
        System.out.println("from c s");
    }

    int d = 40;

    {
        System.out.println("from c ns");
    }

    @Override
    public void display()
    {
        System.out.println("from child overriden display");
    }

    public void onlyChild()
    {
        System.out.println("method implemented only in Child");
    }

    public static void main(String[] args) {
      P obj = new C();

        System.out.println(a);
        System.out.println(obj.b);
        obj.display();
        obj.onlyParent();

        System.out.println(c);
       // System.out.println(obj.d);
        //obj.onlyChild();

    }
}
