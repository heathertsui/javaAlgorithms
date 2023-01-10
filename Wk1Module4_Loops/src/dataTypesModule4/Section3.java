package dataTypesModule4;

public class Section3 {

	public static void main(String[] args) {

		// oneMillion();
		// abc();
		// fibonacci();
		// findingCity();
		firstOver100();

	}

	static void oneMillion() {

		int i = 0;

		while (i++ < 1_000_00) {
			if (i < 11 || i > 99989)
				System.out.println(i);
		}

	}

	static void abc() {

		char character = '\u0061';

		while (character <= '\u007A')
			System.out.println(character++);

	}

	static void fibonacci() {

		int i = 0;
		int newValue = 0;
		int twoBefore = 0;
		int oneBefore = 1;

		while (newValue < 900) {

			if (i < 2)
				System.out.println(i);
			else {
				newValue = twoBefore + oneBefore;
				twoBefore = oneBefore;
				oneBefore = newValue;
				System.out.println("" + newValue);

			}

			i++;
		}
	}

	static void findingCity() {

		int i = 0;
		String[] cities = { "Galsgow", "London", "Birmingham", "Cardiff", "Manchester", "Newcastle" };

		for (i = 0; i < cities.length; i++)
			if (cities[i].charAt(0) != 'B')
				System.out.println(cities[i++] + " doesn't match");
			else {
				System.out.println(cities[i++] + " does match");


			}
	}

	static void firstOver100() {

		int i = 0;
		int[] numbers = { 6, 15, 75, 32, 89, 24, 103, 17, 5, 250, 63, 91 };


			for (i = 0; i < numbers.length; i++)
				if (numbers[i] > 100) {
					System.out.println(numbers[i]);
				}

		}
	}




