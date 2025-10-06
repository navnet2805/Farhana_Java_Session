package Inheritence;

public class Parent {

    int Parentproperty = 2;

    int ParentCar = 2;

    int ParentBuilding = 5;

    public static void ParentMethod()
    {
        System.out.println("from Parent");
    }

    public static void main(String[] args) {
       Parent objParent = new Parent();
        System.out.println(objParent.ParentBuilding);
        System.out.println(objParent.ParentCar);
        System.out.println(objParent.Parentproperty);
        objParent.ParentMethod();
    }

}
