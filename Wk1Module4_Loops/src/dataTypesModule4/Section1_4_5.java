package dataTypesModule4;

import java.util.ArrayList;

public class Section1_4_5 {
	public static void main(String[] args) {

		// 1.1 Array of courses
		String courses[] = { "UNIX", "SQL", "Java", "Python", "Web Apps" };

		for (String course : courses) {
			System.out.println("I love learning" + " " + course);


			}
			// 1.2 Copying to an ArrayList
			ArrayList<String> coursesList = new ArrayList<String>();

			for (int i = 0; i < courses.length; i++) {
				coursesList.add(courses[i]);
		}
		System.out.println("ArrayList of courses: " + coursesList);

		// 1.3 Displaying courses
		for (String course : coursesList)
			System.out.println(course);

		// 1.4 Total price

		ArrayList<Double> prices = new ArrayList<Double>();

		prices.add(4.5);
		prices.add(1.99);
		prices.add(9.75);
		prices.add(3.15);
		prices.add(10.25);

		Double sum = 0.0;
		for (int i = 0; i < prices.size(); i++) {
			sum += prices.get(i);

		}
		System.out.println("Total Price = " + sum);

		// 1.5 Copying to an array

		double[] emptyArray = new double[5];

		for (int i = 0; i < prices.size(); i++) {
			emptyArray[i] = (prices.get(i));

		}
		for (Double k : emptyArray) {
			System.out.println(k);
		}
	}

}

