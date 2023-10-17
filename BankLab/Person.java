public class Person {
		protected String name = "Default person";
		protected int age;
		private double weight;
		private Person[] children = new Person[3];
		private int numberOfChildren = 0;
		
		public Person(String n, int a, double w){
			name = n;
			age  = a;
			weight = w;
		}
		public Person() {
			this.name = "Some name";
		}
		
		public boolean isPersonEligible() {
			return (age > 18 & weight < 80.99);		
		}
		
		public void setAge(int a) {
			age = a;
		}
		
		public int getAge() {
			return this.age;
		}
		
		protected String introduce() {
			return (age < 100)
					? String.format("Hi I am %s and I am %d years old. I have %d children. Thier names are %s and %s.", 
							name, age, this.numberOfChildren, this.children[0].getPersonName(), this.children[1].getPersonName())
					: String.format("Hi I am %s and I am %d years old. I am lying about my age", name, age);
		}
		
		public String getPersonName() {
			return this.name;	
		}
		
		public void addChildren(Person child) {
			children[this.numberOfChildren] = child	;
			this.numberOfChildren++;
		}
		
		public int getNumberOfChildren() {
			return this.numberOfChildren;
		}
}	
	