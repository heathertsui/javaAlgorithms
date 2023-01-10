package dataTypesModule5;

public class Section2_2rectangle {

	public static void main(String[] args) {
		printRect(2, 10, 'x');
	}

	public static void printRect(int width, int height, char marker) {
		printHorizontal(width, marker);
		for (int j = 0; j < height - 2; j++) {
			printVertical(width, marker);
		}
		printHorizontal(width, marker);
	}

	public static void printVertical(int width, char marker) {
		System.out.print(marker);
		for (int j = 0; j < width - 2; j++) {
			System.out.print('x');
		}
		System.out.println(marker);
	}

	public static void printHorizontal(int width, char marker) {
		for (int j = 0; j < width - 1; j++) {
			System.out.print(marker);
		}
		System.out.println(marker);
	}

}