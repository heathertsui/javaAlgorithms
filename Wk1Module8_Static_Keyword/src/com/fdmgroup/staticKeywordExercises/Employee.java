package com.fdmgroup.staticKeywordExercises;

public class Employee {
	private String name;
	private String jobTitle;
	private double hourlyWage;
	private static double minimumWage;

	public Employee(String name, String jobTitle) {
		this.name = name;
		this.jobTitle = jobTitle;

	}

	public String getName() {
		return name;
	}


	public String getJobTitle() {
		return jobTitle;
	}


	double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		
		if (hourlyWage < Employee.minimumWage) {
			this.hourlyWage = minimumWage;
		} else {
			this.hourlyWage = hourlyWage;
		}
	}



	static public double getMinimumWage() {
		return minimumWage;
	}

	static public double setMinimumWage(double minimumWage) {
		return Employee.minimumWage = minimumWage;

	}

}
