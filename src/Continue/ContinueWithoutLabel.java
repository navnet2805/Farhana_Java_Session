package Continue;

public class ContinueWithoutLabel {
    public static void main(String[] args) {
        //print a number from 1 to 10 by skipping the number 5.

        for (int i=1; i<=10 ; i++)
        {
            if (i==5)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
