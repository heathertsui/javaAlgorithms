package datatypes;

public class Section4 {
	public static void main(String[] args) {

		dataTypes41();
		// dataTypes42();
		// dataTypes43();

	}

	static void dataTypes41() {
		String number1 = "5";
		String number2 = "3";

		System.out.println(Integer.parseInt(number1) + Integer.parseInt(number2));
	}

	static void dataTypes42() {
		String number1 = "5.3";
		String number2 = "3.2";

		System.out.println(Double.parseDouble(number1) + Double.parseDouble(number2));
	}

	static void dataTypes43() {
		String string1 = "abc11";
		String string2 = "9xyz";
		String string3 = "abc7xyz";
		
		String subString1 = string1.substring(3);
		String subString2 = "" + string2.charAt(0); // "" this converts number to string
		String subString3 = "" + string3.charAt(3);
		
		System.out.println(Integer.parseInt(subString1) + 
				Integer.parseInt(subString2) + Integer.parseInt(subString3));

}
}
