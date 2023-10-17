
public class Lab2Ex4 {
	public static void main(String[] args) {
		String firstName = "Harsh";
		String lastName = "Suvarna";
		String fullName = firstName + " ssddfff " + lastName;
//		System.out.println(fullName);
		
		
		String birthDay = "I was born on: ";
		int someNumber = 2;
//		System.out.println(birthDay + someNumber);
		
		int numberOfPies = 109;
		int numberOfPeople = 32;
		int wholePiesForEachPerson = (int) numberOfPies/numberOfPeople;
		int leftoverPies = (int) numberOfPies % numberOfPeople;
		System.out.print("There are "+numberOfPies+ " pies each, and "+ leftoverPies +" leftovers");
	}
}
