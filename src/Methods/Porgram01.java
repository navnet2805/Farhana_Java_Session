package Methods;

public class Porgram01 {

    public static void main(String[] args)
    {
////Program to find the no of digit in a number 14578
        System.out.println("Program started");
        NumberOfDigits(); //calling method
        System.out.println("Program finished");
    }

    public static void NumberOfDigits() //called method
    {
        int num=14578;
        int count =0;
        while (num>0)
        {
            count ++;
            num=num/10;
        }
        System.out.println(count);
    }

}

