package Methods;

public class Program02 {


    public static void main(String[] args)
    {
////Program to find the no of digit in a number 1457890
        System.out.println("Program started");
        int num=145789;
        int count =0;
        NumberOfDigits(num,count);
        NumberOfDigits(23.0,0);//calling method
        System.out.println("Program finished");
    }

    public static void NumberOfDigits(int n, int c) //called method
    {
        while (n>0)
        {
            c++;
            n=n/10;
        }
        System.out.println(c);
    }

    public static void NumberOfDigits(double n, int c) //called method
    {
        System.out.println("ANother method");
        System.out.println(n);
        System.out.println(c);
    }

}
