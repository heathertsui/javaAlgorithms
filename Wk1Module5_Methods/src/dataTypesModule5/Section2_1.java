package dataTypesModule5;

public class Section2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayTimesTable(10);
	}

	public static void displayTimesTable(int a) {


		System.out.println("Multiplication table for " + a);

		int sum = a;
			for (int i = 1; i <= 12; i++) {
				System.out.println(i + " x " + a + " = " + sum * i);
			}
			
		

	}

}
