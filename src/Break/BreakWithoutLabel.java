package Break;

public class BreakWithoutLabel {
    public static void main(String[] args) {
        // try to print the values from 1 to 10, whenever the number is 5 then come out of the loop
        for (int i=1; i<=10 ; i++)
        {
            if (i==5)
            {
                break;
            }
            System.out.println(i);
        }
        System.out.println("came out of loop");
    }
}
