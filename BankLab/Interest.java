
public class Interest extends BankAccount {
	
	double interestRate;
	public Interest(Person person){
		super(person);
		this.person = person;
		this.interestRate = 10.0;
	}
	
	public double withdraw(double amount) {
		if(this.balance >= amount) {
			this.balance -= amount;
			return this.balance;
		}else {
			System.out.println("Withdraw failed. Insifficient balance!");
			return this.balance;	
		}
	} 
	
	public String toString() {
		return String.format(" IN INTEREST,Name: %s, Account number: %d, balance: %.1f", this.person.getPersonName(), this.accountNumber, this.balance);
	}
	
	public double getInterestOnBalance() {
		return this.balance + (this.balance * this.interestRate/100);
	}
}
