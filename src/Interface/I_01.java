package Interface;

public interface I_01 {

    int a = 10; // static and final

    //static method
    public static void m01()
    {
        System.out.println("from interface static methods");
    }

    default void m02()
    {
        System.out.println("from interface default methods");
    }

    void m03(); //abstract method

    public abstract void m04(); //abstract method

    public static void main(String[] args) {
        I_01 obj;
    }


}
