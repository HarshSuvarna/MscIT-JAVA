
public class Student extends Person{
	private double GPA;
	
	public Student(String name, double GPA) {
		super();
		this.name = name;
		this.GPA = GPA;	
	}
	
	public double getGpa() {
		return GPA;
	}
	
	public String introduce() {
		if(this.age > 18) {
			return "You are not a student";
		}else return "You are " + this.age+ " years old.";	
	}
}
