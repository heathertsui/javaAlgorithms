package dataTypesModule4;


public class JavaLoops {

	public static void main(String[] args) {

//		incrementOperators();
//		whileLoop();
//		doWhileLoop();
//		forLoop();
//		incrementOperators2(); 
		System.out.println(reverseString("12345678"));
//		forEachLoop();
//		continueForLoop();
//		breakForLoop();

	}

	static void incrementOperators() {
		int i = 0;
		int j = 0;
		int k = 100;
		int l = 100;

		while (i < 10) {

			System.out.println("i " + ++i); // add one each time
			System.out.println("j " + (j += 10)); // add 10 each time
			System.out.println("k " + k--); // subtract 1 each time
			System.out.println("l " + (l -= 10) + "\n"); // subtract 10 each time

		}
	}

	/*
	 * Simple for loop Write out the counter value 10 times.
	 */
	static void forLoop() {

		title("Simple For Loop");

		for (int counter = 0; counter < 10; counter++) // for performance don't use <= can declare counter in loop if
		{

			System.out.println("For Loop Counter value is: " + counter);

		}


	}

	static void whileLoop() {

		int counter = 0; // must be initialized before loop

		title("While Loop");

		while (counter++ < 10) {

			System.out.println("While Loop Counter value is: " + counter);
		}

	}

	static void doWhileLoop() {

		int counter = 0;

		title("Do While Loop");

		do {

			System.out.println("Do While Loop Counter value is: " + counter);

		} while (counter++ < 10); // Need to finish with semicolon

	}

	static void forEachLoop() {

		String[] bookList = { "Head First Java", "How to Program", "Effective Java" }; // Initialize a String array

		title("For Each");

		for (String book : bookList)
			System.out.println(book);

		title("A a For Loop");

		for (int counter = 0; counter < bookList.length; counter++)
			System.out.println(bookList[counter]);

	}

	static void incrementOperators2() {

		for (int i = 0, j = 0, k = 100, l = 100; i < 10; i++, j += 10, k--, l -= 10) {
			System.out.println("i " + i);
			System.out.println("j " + j);
			System.out.println("k " + k);
			System.out.println("l " + l + "\n");

		}
	}

	static String reverseString(String value) {
		char[] reverse = new char[value.length()];
		int len = value.length();

		for (int i = 0, j = len - 1; i < len; i++, j--)
			reverse[i] = value.charAt(j);

		return new String(reverse);

	}
	static void continueForLoop() {

		title("Continue in For Loop");

		for (int counter = 0; counter < 10; counter++) { // for performance don't use <= can declare counter in loop if

			if (counter % 2 != 0) {
				continue;
			}

			// if (counter % 2 == 0)
			System.out.println("For Loop Counter value is: " + counter);

		}

	}

	static void breakForLoop() {

		title("Break in For Loop");

		// for (int counter = 0; counter < 10; counter++) {
		for (int counter = 0; counter < 10 && counter != 7; counter++) {

			// if (counter == 7)
			// break;

			System.out.println("For Loop Counter value is: " + counter);

		}

	}

	// for (int counter = 0; counter < 10 && counter != 7; counter++) {

	static void title(String title) {
		System.out.println("\n" + title + "\n");
	}

}
