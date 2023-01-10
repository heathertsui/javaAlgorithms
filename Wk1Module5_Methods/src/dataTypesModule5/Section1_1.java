package dataTypesModule5;

public class Section1_1 {
	public static void main(String[] args) {

		getPoints();

	int points = getPoints();
	System.out.println("You’ve scored " + points + " points!");
		}

	

		public static int getPoints() {
			String alienColour = "red";

		{
			if (alienColour == "green") {
				return 5;
			} else if (alienColour == "red") {
				return 10;
			} else if (alienColour == "yellow") {
				return 15;
			} else {
				return 0;
			}
		}

	}

}

