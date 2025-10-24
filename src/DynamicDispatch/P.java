package DynamicDispatch;

public class P {

    static  int a = 10;

    static {
        System.out.println("from P s");
    }

    int b = 20;

    {
        System.out.println("from P ns");
    }

    public void display()
    {
        System.out.println("from parent display");
    }

    public void onlyParent()
    {
        System.out.println("method implemented only in Parent");
    }
}
