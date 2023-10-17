
public class Lab4Ex1 {
	public static void main(String[] args) {
		int year = 2020;
		System.out.print(year+ " is" + (checkLeapYear(year) ? "": " not") + " a leap year");
	}
	public static Boolean checkLeapYear(int year) {
		if((year % 4 == 0 & (year%100!=0) || year%400==0 )) {
			return true;
		}else {
			return false;
		}
	}
}
