package dataTypesModule4;

import java.util.Arrays;

public class Section1_6 {

	public static void main(String[] args) {

		// 1.6 Adding Numbers from a string
		String text = "10, 7, 25, 3, 8";
		String[] split = text.split(", ");
		System.out.println(Arrays.toString(split));


		int[] nums = new int[] { 10, 7, 25, 3, 8 };

		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		System.out.println("Total = " + sum);

		// 1.7 Reversing a string
		String string = "desrever neeb sah txet siht";

		int length = string.length();
		char[] reverse = new char[string.length()];

		char[] chars = string.toCharArray();

		for (char letter : chars)
			reverse[--length] = letter;

		System.out.println("\n" + String.valueOf(reverse));

	}

}
