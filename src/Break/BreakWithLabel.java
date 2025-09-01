package Break;

public class BreakWithLabel {
    public static void main(String[] args) {

        abc:
        for (int i=1; i<=3 ; i++)
        {
            for (int j=1 ; j<=4 ; j++)
            {
                System.out.println(j);
                break abc;
            }
        }
    }
}
