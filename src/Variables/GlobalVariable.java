package Variables;

public class GlobalVariable
{

    static int i = 35; // global variable


    static public void meth()
    {
        System.out.println(i);
    }

    public static void main(String[] args)
    {
        System.out.println(i);
        meth();
    }

}
