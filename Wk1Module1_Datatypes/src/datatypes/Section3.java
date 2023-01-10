package datatypes;

public class Section3 {
	public static void main(String[] args) {
		// dataTypes31();
		// dataTypes32();
		dataTypes33();

	}

	static void dataTypes31() {

		char letter = 'a';
		int code = 98;

		System.out.println((int) letter);
		System.out.println((char) code);
		System.out.println((char) 36);

	}

	static void dataTypes32() {
		System.out.println('c' - 'a');
		System.out.println('z' - 'a');
	}

	static void dataTypes33() {
		char char1 = 'x';
		char char2 = 'y';
		char char3 = 'z';
		String string1 = "z";
		String string2 = "y";
		String string3 = "w";

		System.out.println();
		System.out.println(char1 + char2 + char3);
		System.out.println(char1 + char2 + string1);
		System.out.println(char1 + char2 + +char3 + string1);
		System.out.println(char1 + char2 + string1 + char3);

		System.out.println(char1 + string2 + char3);
		System.out.println(char1 + string1 + char1 + char2);
		System.out.println(string3 + char1 + char2 + char3);

		System.out.println("" + char1 + char2 + char3);

		// Adding 2 consecutive chars gives the sum of their Unicode values.
		// Adding a char and a String creates a new String containing the characters
		// from both.

	}
}
