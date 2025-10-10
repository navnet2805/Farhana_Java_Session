package OOPS.Encapsulation;

public class User extends ATM{

    public static void main(String[] args) {
        int withdrawAmt = 20000;

        User obj = new User();
        obj.getAccountBalance(); // to check the account balnace
        System.out.println("I want to withdraw 20k");
        obj.setWithdraw(withdrawAmt);
        obj.getWithdraw();
        obj.getAccountBalance();
    }
}
