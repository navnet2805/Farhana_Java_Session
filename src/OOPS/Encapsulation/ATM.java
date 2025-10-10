package OOPS.Encapsulation;

public class ATM {

    private int AccountBalance = 50000;

    private int withdraw;

    public void getAccountBalance()
    {
        System.out.println("The updated account balance is: "+this.AccountBalance);
    }

    public void setAccountBalance()
    {

    }

    public void getWithdraw()
    {
        System.out.println("the withdrawn amount is : " +this.withdraw);
    }

    public void setWithdraw(int withdraw1)
    {
        this.AccountBalance = this.AccountBalance - withdraw1;
        this.withdraw = withdraw1;

    }



}
