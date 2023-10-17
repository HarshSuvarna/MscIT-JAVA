public class Person {
		public String firstName = "Default person";
		private String lastName;
		private int age;
		private double weight;
		
		public Person(String fn, String ln, int a, double w){
			firstName = fn;
			lastName = ln;
			age  = a;
			weight = w;
		}
		public Person() {
			this.firstName = "Some name";
		}
		
		public boolean isPersonEligible() {
			return (age > 18 & weight < 80.99);		
		}
		
		public void setAge(int a) {
			age = a;
		}
		
		protected String introduce() {
			return (age < 100)
					? String.format("Hi I am %s and I am %d years old", firstName, age)
					: String.format("Hi I am %s and I am %d years old. I am lying about my age", firstName, age);
		}
}