package OOPS.Polymorphism.MethodOverriding;

public class MO_Parent {

    public void display()
    {
        System.out.println("from parent");
    }

    public static void main(String[] args) {
        MO_Parent parentObj= new MO_Parent();
        parentObj.display();
    }
}
