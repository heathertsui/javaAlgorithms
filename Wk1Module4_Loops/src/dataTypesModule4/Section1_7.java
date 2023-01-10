package dataTypesModule4;

public class Section1_7 {

	public static void main(String[] args) {
		
		String reverseString = "esrever neeb sah txet siht";
		char[] characters = reverseString.toCharArray();

//		for (int i = 0; i < reverseString.length(); i++) {
//			characters[i] = reverseString.charAt(i);
//		}
//		for (char c : characters) {
//			System.out.println(c);
//			
			
			int len = reverseString.length();

			for (int i = 0, j = len - 1; i < len; i++, j--)
				characters[i] = reverseString.charAt(j);
			System.out.println(characters);


		}


	}


