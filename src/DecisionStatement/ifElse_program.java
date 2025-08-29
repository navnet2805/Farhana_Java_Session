package DecisionStatement;

public class ifElse_program {
    public static void main(String[] args) {
        //print the number from 1 to 10,
        // action1: whenever the number is even then print the number along with *
        //action2: whwnever the number is odd then print the number along with $.

        for (int i=1; i<=10 ; i++)
        {
            if (i%2==0) //condition for even number
            {
                System.out.println(i+"*");
            }
            else // else will be executed whenever if condition fails
            {
                System.out.println(i+"$");
            }
        }
    }
}
