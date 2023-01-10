package dataTypesModule3;
// import java.util.ArrayList;
// import java.util.Collections;

public class conditionals {

	public static void main(String[] args) {
		String alienColour = "yellow";
		{
			if (alienColour == "green") {
				System.out.println("You got 5 points");
			} else if (alienColour == "red") {
				System.out.println("You got 10 points");
			} else if (alienColour == "yellow") {
				System.out.println("You got 15 points");
			} else {
				System.out.println("Invalid colour");
			}
		}
}
}
