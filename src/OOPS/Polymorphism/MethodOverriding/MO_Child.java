package OOPS.Polymorphism.MethodOverriding;

public class MO_Child extends MO_Parent {

    public void run()
    {
        System.out.println("from child run method");
    }

    public void display()
    {
        System.out.println("from child"); //changed the implementation
    }

    public static void main(String[] args) {
       MO_Child childObj =  new MO_Child();
       childObj.run();
       childObj.display();
    }
}
