package dataTypesModule4;

// contains Section: 2.1, 2.2, 2.3, 2.4
public class Section2_2 {
	public static void main(String[] args) {

		// million();
		summingMillion();
		// oddNums();
		// threeTimesTable();
		// incrementAlternateNums();
		// alternateLetter();
		// allTimesTable();

	}

	// 2.1 one million
	public static void million() {
		int value = 1000000;
		{
			for (int i = 0; i <= value; i++) {
				System.out.println(i);
			}

		}
	}

	// 2.2 summing a million
	public static void summingMillion() {
		long sum = 0L;
		int value = 1000000;
		{
			for (int i = 1; i <= value; i++) {
				// System.out.println(i);
				sum += i;
			}
			System.out.println(sum);
		}
	}

	// 2.3 odd numbers
	public static void oddNums() {
		for (int i = 1; i < 20; i += 2) {
			System.out.println(i);
		}
	}

	// 2.4 three times table
	public static void threeTimesTable () {

		int sum = 3;
		{
			for (int i = 1; i <= 36; i++) {
				System.out.println(i + " x 3 = " + sum * i);
			}
		}
	}

	// 2.5 incrementing alternate numbers
	public static void incrementAlternateNums() {
		int[] scores = new int[] { 25, 15, 99, 75, 47, 59, 82 };

		int[] array = new int[scores.length];
		for (int i = 1; i < scores.length; i += 2) {
			array[i] = scores[i] + 1;
			System.out.println(array[i]);
			for (int j = 0; j < scores.length; j++) { // use another for loop to display all the values in the array
				System.out.println(scores[j]);
			}
		}
	}

	// 2.6 alternative letters
	public static void alternateLetter() {
		char c;

		for (c = 'A'; c <= 'Z'; c = c += 2)
			System.out.print(c + " ");

	}

	// 2.7 All times tables
	public static void allTimesTable() {
		for (int i = 1; i < 13; i++) {
			for (int j = 0; j <= 12; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println("Multiplication table of " + i);
		}
	}
}
