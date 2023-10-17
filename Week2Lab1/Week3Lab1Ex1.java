
public class Week3Lab1Ex1	 {
	public static void main(String[] args) {
		Person harsh = new Person("Harsh", "Suvarna", 24, 72.0);
		System.out.println(harsh.isPersonEligible());
		System.out.println(harsh.firstName);
		harsh.setAge(14);
		System.out.println(harsh.isPersonEligible());
//		System.out.println(person.toString());
//		System.out.println(person.weight); // will give an error because weight is a private attribute
		Person kurved = new Person("Kurved", "Salunke", 1000, 81.7);
		System.out.println(kurved.firstName);
		System.out.println(kurved.isPersonEligible());
		System.out.println(kurved.introduce());
	}
}
