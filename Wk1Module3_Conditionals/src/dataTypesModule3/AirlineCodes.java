package dataTypesModule3;

public class AirlineCodes {

	public static void main(String[] args) {
		String flightCode = "LH";
		{
			// if (flightCode.contains("BA") || flightCode.contains("LH") ||
			// flightCode.contains("FR")) {
			// System.out.println("valid airline");
			// } else {
			// System.out.println("unrecognised or invalid airline");
			// }

			// Airline codes 3
			if (!(flightCode.contains("BA") || flightCode.contains("LH") || flightCode.contains("FR"))) {
				System.out.println("unrecognised or invalid airline");
			}
		}
	}
}
