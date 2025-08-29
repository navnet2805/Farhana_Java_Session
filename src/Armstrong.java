public class Armstrong {
    public static void main(String[] args) {
        //Armstrong
        /*
        153
        find the number of digits: 3
        armstrong logic: 1*1*1 + 5*5*5 + 3*3*3 = 153
        153 == 153 ---> the number 153 is armstrong
         */

        //declaration
        int Original_num = 153;
        int digit = 0;
        int result = 0;

        //find the number of digits:
        int num = Original_num;
        while(num>0)
        {
            if (num%10!=0) //1%10 -> 0!=0
                digit++; //3

            //updation
            num= num/10; //--> 15/10--1
        }
        System.out.println(digit);

        //armstrong logic: 1*1*1 + 5*5*5 + 3*3*3 = 153
        int num1 = Original_num;
        while (num1>0)
        {
            int eachdigit = num1%10 ; //last number --> 5
             result = result + (int)Math.pow(eachdigit,digit);
            num1= num1/10;
        }

        //153 == 153 ---> the number 153 is armstrong
        if (Original_num==result)
        {
            System.out.println("the number " + Original_num + " is armstrong");
        }
        else
            System.out.println("the number " + Original_num + " is not armstrong");

    }
}
