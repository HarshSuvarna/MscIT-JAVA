
public class InsufficientFundsException extends Exception {
	public InsufficientFundsException() {
		System.out.println("Withdrawal Failed. Reason: Insufficient Funds.");
	}
}
