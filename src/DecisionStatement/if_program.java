package DecisionStatement;

public class if_program {
    public static void main(String[] args) {
        //print only the even number from 1 to 10.

        for (int i=1; i<=10 ; i++)
        {
            if (i%2==0) //condition for even number
            {
                System.out.println(i);
            }
        }
    }
}
