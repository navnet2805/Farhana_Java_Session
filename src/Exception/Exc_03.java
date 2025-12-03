package Exception;

public class Exc_03 {
    public static void main(String[] args) {
        int a = 10;

        try {
            throw new RuntimeException("/ by zero");
        }
        catch (Exception e)
        {
            System.out.println("Exception is handled");
        }
        finally {
            System.out.println("This line has to be executed always");
        }
    }
}
