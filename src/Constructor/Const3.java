package Constructor;

public class Const3 {
    int eyes;
    int nose;
    int legs,hands;

    Const3(int eyes,int nose, int legs, int hands)
    {
        this.eyes = eyes;
        this.nose=nose;
        this.legs=legs;
        this.hands=hands;
    }

    Const3(int eyes,int nose, int legs)
    {
        this.eyes = eyes;
        this.nose=nose;
        this.legs=legs;
    }

    Const3()
    {

    }
    public static void main(String[] args) {
        Const3 obj =new Const3(2,1,2,2); //object
        System.out.println(obj.legs);
        System.out.println(obj.eyes);
        System.out.println(obj.nose);
        System.out.println(obj.hands);
        Const3 obj1 =new Const3(2,1,2); //object
        Const3 obj2 =new Const3(); //object




    }
}
