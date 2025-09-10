package Loops;

public class primeNum {
    //write a program to check the number is prime or not.
    //2. Print the prime numbers from range 1 to 100.
    public static void main(String[] args) {

        for (int num=1 ; num<=100 ; num++) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(num);
            }
        }
    }
}
