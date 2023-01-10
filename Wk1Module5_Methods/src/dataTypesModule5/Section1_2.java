package dataTypesModule5;

public class Section1_2 {

	public static void main(String[] args) {

		sumOfNumsUpto(10);

	}

	public static int sumOfNumsUpto(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum += i;
		}
		System.out.println(sum);
		return sum;

	}

}
