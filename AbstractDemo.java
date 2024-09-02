abstract class Bank
{
    void openAccount() //package orivate or default method
    {
        System.out.println("account is opened");
    }
    abstract void deposit(float amt);
}
class CityBank extends Bank{
    public void deposit(float amt)
    {
        System.out.println("Deposited: "+amt);
    }

}
public class AbstractDemo
{
    public static void main(String[] args)
    {
       Bank b=new CityBank();
       b.openAccount();
       b.deposit(1000);
    }
}