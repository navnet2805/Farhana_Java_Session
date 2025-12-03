package Exception;

public class Exc_01 {
    public static void main(String[] args) {
        int a = 10;
        try {
            System.out.println(10 / 0);
        }
        catch (Exception e)
        {
            System.out.println("Exception is handled");
        }
        finally {
            System.out.println("This line has to be executed always");
        }
        /*
        try -> to perform any action that might cause exception
        catch -> catch the exception
        finally -> it will alway execute irrespective of exception occured or not.
         throws -> is used for method signature
         throw - it will throw an exception and it is used inside the block
         */
    }
}
