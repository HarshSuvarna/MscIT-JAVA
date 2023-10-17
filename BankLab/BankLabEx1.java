import java.util.Arrays;

public class BankLabEx1 {
	public static void main(String[] args) {
		Person person1 = new Person("Steve", 40, 89.4);
		BankAccount acc1 = new BankAccount(person1);
		
		Person person2 = new Person("Tony", 50, 65.0);
		BankAccount acc2 = new BankAccount(person2);
		
//		System.out.println(acc1.getAccountNumber());
//		System.out.println(acc2.getAccountNumber());
//		
//		System.out.println(acc1.deposit(9999999));
//		
		acc2.deposit(1000);
		System.out.println(acc1.withdraw(9999990));
//		System.out.println(acc2.getBalance());
//		
//		System.out.println(acc1.toString());
//		System.out.println(acc2.toString());
		
		Person person3 = new Person("Bruce", 55, 55.4);
		
		BankAccount acc3 = new BankAccount(person3);
		BankAccount acc4 = new BankAccount(person3);
		
//		System.out.println(acc3.toString());
//		System.out.println(acc4.toString());
		
//		System.out.println(acc2.toString());
//		System.out.println(acc3.toString());
		
		acc2.transferFunds(100.0, acc3, acc2);
//		System.out.println("Rs 100 is being transfered from "+ acc2.getName() + " to "+ acc3.getName());
		
//		System.out.println(acc2.toString());
//		System.out.println(acc3.toString());
		
		Interest interest = new Interest(person3);
		interest.deposit(1000);
//		System.out.println(interest.getInterestOnBalance());
		
		BankAccount acc5 = new Interest(person1);
		acc5.deposit(1000);
//		System.out.println(acc5.toString());	
		
		Person[] people = new Person[3];
		people[0] = new Person("Harsh", 24, 55.0);
		people[1] = new Person("Mat", 52, 25.0);
		people[2] = new Person("Bob", 14, 15.0);
		int ageSum = 0;
		for(int i=0; i<people.length; i++) {
//			System.out.println(people[i].introduce());
			ageSum += people[i].getAge();
		}

//		System.out.println(ageSum);
		people[0].addChildren(new Person("Chotu",2, 3.3));
		people[0].addChildren(new Person("Motu", 3, 4.5));
		System.out.println(people[0].introduce());
	}
}
