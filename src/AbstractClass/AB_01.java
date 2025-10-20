package AbstractClass;

public abstract class AB_01 {

    AB_01() //constructor
    {

    }

    int i = 20; // non static variable

    static int j = 40; // static variable

    final int k = 50; //K is a final variable

    static void m01()
    {
        System.out.println("from m01");
    }

   public abstract void m03(); //abstract method

    public static void main(String[] args) {
        //new AB_01(); -- we can not create an object.
    }
}
