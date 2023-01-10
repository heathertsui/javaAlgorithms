package com.fdmgroup.staticKeywordExercises;

public class Runner1 {

	public static void main(String[] args) {
		Employee.setMinimumWage(9.53);

		System.out.println("Minimum wage = " + Employee.getMinimumWage());


		Employee e1 = new Employee("Tom", "CEO");
		Employee e2 = new Employee("Jack", "sales");
		Employee e3 = new Employee("Heeather", "FDM consultant");

		e1.setHourlyWage(1.0);
		e2.setHourlyWage(1.0);
		e3.setHourlyWage(10000000.0);
//
		System.out.println(e1.getHourlyWage());
		System.out.println(e2.getHourlyWage());
		System.out.println(e3.getHourlyWage());
	}

}
