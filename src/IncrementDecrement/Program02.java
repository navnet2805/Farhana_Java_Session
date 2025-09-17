package IncrementDecrement;

public class Program02 {
    public static void main(String[] args) {
        int a=10;
        int b=-20;
        int c=15;
        int sum;

        // a=10  b=-20  c=13
        sum = a++ + --b + (c--/1) * 10 + --a - b++ - --c;
        //    10  + (-21)+ (15/1) * 10 + 10  - (-21)- 13;
        //Sum = 157;

        System.out.println(sum);

        /*
        1 --- ()
        2 ----Division/multiplication
        3-----Addition/subtraction
         */
    }
}
