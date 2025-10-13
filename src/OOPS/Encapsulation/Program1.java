package OOPS.Encapsulation;

public class Program1 {
   private int a;

   public int geta()
   {
       return this.a;
   }

   public void seta(int a)
   {
       this.a=a;
   }

    public static void main(String[] args) {
        System.out.println(new Program1().a);
    }
}
