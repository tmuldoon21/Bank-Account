/**
 * 
 * @author Tyler Muldoon
 * Bank Account
 */
public class BankAccount 
{
	private String name;
	private double balance;
	
	public BankAccount(String name, int balance)
	{
		String n = name;
		double b = balance;	
	}
	
	public BankAccount()
	{
		String name = "Tyler";
		double balance = 0;
	}
	
	public void deposit(double deposit)
	{
		balance += deposit;
	}
	
	public void withdraw(double withdraw)
	{
		balance -= withdraw;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
