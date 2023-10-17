
public class BankAccount {
	protected Person person;
	protected int accountNumber;
	protected double balance;
	private static int nextAccountNumber = 0;
	
	public BankAccount(Person person){
		this.person = person;
		this.balance = 0.0;
		this.accountNumber = nextAccountNumber;
		this.nextAccountNumber++;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public double setBalance(double newbalance) {
		this.balance = newbalance;
		return this.balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double deposit(double amount) {
		this.balance += amount;
		return this.balance;
	}
	
	public String getName() {
		return this.person.getPersonName();
	}
	
	public String toString() {
		return String.format("Name: %s, Account number: %d, balance: %.1f", this.person.getPersonName(), this.accountNumber, this.balance);
	}
	
	public double withdraw(double amount) {
		if(this.balance > amount) {
			this.balance -= amount;
			return this.balance;
		}else {
			System.out.println("Withdraw failed. Insifficient balance!");
			return this.balance;	
		}
	}
	
	public double withDrawException(double amount) throws InsufficientFundsException {
		if(this.balance < amount) {
				throw new InsufficientFundsException();
		}
		this.balance -= amount;	
		return this.balance;	
	}
	
	public double transferFunds(double amount, BankAccount to, BankAccount from) {
		to.setBalance(to.getBalance() + amount);
		from.setBalance(from.getBalance() - amount	);
		return from.getBalance();
	}
	
	
}
