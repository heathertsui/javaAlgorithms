package dataTypesModule5;

public class MethodsTute {
	public static void main(String[] args) {

		welcome();
		multiply(5, 10);
		multiply(6, 8);
		multiply(2, 10);
		divide(20, 5);
	}

	public static void welcome() {
		System.out.println("welcome to our calculator!");
	}

	public static void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public static void divide(int a, int b) {
		System.out.println(a / b);
	}

}
