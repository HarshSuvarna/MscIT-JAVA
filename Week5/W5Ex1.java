import java.util.InputMismatchException;
import java.util.Scanner;

public class W5Ex1 {
	public static void main(String[] args) {
		boolean stop = false;
		do {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter a string: ");
			String line = s.nextLine();
			// System.out.println(line);
			try {
				Scanner ss = new Scanner(line);
				int num = ss.nextInt();
				System.out.println("You entered " + num);
				stop = true;
				System.out.println("Execution Stopped");
			} catch (InputMismatchException e) {
				System.out.println("Wrong input. Enter a valid value");

			}
		} while (!stop);

	}
}
