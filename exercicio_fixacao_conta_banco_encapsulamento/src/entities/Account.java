package entities;

public class Account {
	
	private int accNumber;
	private String accName;
	private double balance;
	
	public Account(int accnumber, String name) {
		this.accNumber = accnumber;
		this.accName = name;
	}
	
	public Account(int accnumber, String name, double initialDeposit) {
		this.accNumber = accnumber;
		this.accName = name;
		deposit(initialDeposit);
	}
	
	public int getAccount() {
		return accNumber;
	}
	
	public String getName() {
		return accName;
	}
	
	public void setName(String accName) {
		this.accName = accName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double deposit) {
		balance += deposit;
	}
	
	public void withdraw(double withdraw) {
		balance -= withdraw + 5;
	}
	
	public String toString() {
		return "Account " 
		+ accNumber + 
		", Holder: " 
		+ accName 
		+ ", Balance: $ " 
		+ String.format("%.2f", balance);
	}

}
