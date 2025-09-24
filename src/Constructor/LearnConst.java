package Constructor;

public class LearnConst {
    //Is  a special method
    //features:
    int a,b,c;

    LearnConst() //default constructor
    {

    }

    LearnConst(int a,int b, int c) //3 param constructor
    {
        this.a = a;
        this.b=b;
        this.c=c;

    }

    public LearnConst(int i, int i1) {
    }

    public static void main(String[] args) {
        LearnConst obj=new LearnConst(2,3);

        LearnConst obj1=new LearnConst();
    }
}

