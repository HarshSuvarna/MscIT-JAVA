
public class Lab3Ex1 {
	public static void main(String[] args) {
		System.out.println(summariseCircle(5.6));
	}
	
	public static String summariseCircle(double r) {
		double area = compArea(3.14, r);
		double circumference = compCircumference(3.14, r);
		return "The AREA of the circle is "+area+", and the CIRCUMFERENCE is " + circumference+".";
	}
	
	public static double compArea(double pi, double r) {
		 return pi*r*r;
	}
	
	public static double compCircumference(double pi, double r) {
		return 2*pi*r;
	}
}
