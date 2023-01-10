package dataTypesModule5;

public class Section2_3triangle {

	public static void main(String[] args) {
		triangle(4);

	}

	public static void triangle(int a) {

		int i, j;
		int size = a;
		i = 1;
		while (i <= size) {
			j = 1;
			while (j <= i) {
				System.out.print("x");
				j++;
			}
			i++;
			System.out.println();

		}

	}
}