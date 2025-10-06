package Inheritence.SingleLevel;

public class Child extends Parent {

    int Childroperty = 1;

    int ChildCar = 1;

    int ChildBuilding = 2;

    public static void ChildMethod()
    {
        System.out.println("from Child");
    }

    public static void main(String[] args) {
      Child objChild = new Child();
        System.out.println(objChild.ChildBuilding);
        System.out.println(objChild.ChildCar);
        System.out.println(objChild.Childroperty);
        objChild.ChildMethod();
        System.out.println(objChild.ParentBuilding);
        System.out.println(objChild.Parentproperty);
        System.out.println(objChild.ParentCar);
        objChild.ParentMethod();
    }
}
