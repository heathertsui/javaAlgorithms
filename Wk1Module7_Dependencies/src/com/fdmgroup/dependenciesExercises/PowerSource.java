package com.fdmgroup.dependenciesExercises;

public class PowerSource {

	double watts;


	public void setWatts(Double watts) {
		this.watts = watts;
	}

	public double supplyPower() {
		System.out.println("watts recieved from powersource:");
		return watts;
	}

}
