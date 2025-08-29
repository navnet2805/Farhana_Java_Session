package DecisionStatement;

public class ElseIf_ladder {
    public static void main(String[] args) {
        //print the number from 1 to 20,
        // action1: whenever the number is divisible by 2 then print the number along with @
        //action2:  whenever the number is divisible by 3 then print the number along with $
        //action3:  whenever the number is divisible by 5 then print the number along with &

        for (int i=1; i<=20 ; i++)
        {
            if (i%2==0) //divisible by 2
            {
                System.out.println(i+"@");
            }
            else if (i%3==0) //divisible by 3
            {
                System.out.println(i+"$");
            }
            else if (i%5==0)//divisible by 5
            {
                System.out.println(i+"&");
            }
        }
    }
}
