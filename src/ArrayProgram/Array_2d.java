package ArrayProgram;

public class Array_2d {

    public static void main(String[] args) {

        int[] a = new int[5]; // 1 D

        int[][] b = new int[2][3];

        int count = 1;

        for (int row= 0; row<2 ; row++)
        {
            for (int col=0; col<3 ; col++)
            {
               b[row][col] =  count++;
                System.out.print(b[row][col] + "      ");
            }
            System.out.println();
        }
    }
}
