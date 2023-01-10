package dataTypesModule3;

public class ValidAccountNumbers {

	public static void main(String[] args) {
		Integer accountNumber = 20000000;
		{
			if (accountNumber > 10_000_000 & accountNumber < 99_999_999) {
				System.out.println("Valid account numbber");
			} else {
				System.out.println("Invalid account number");
			}
		}
	}
}
