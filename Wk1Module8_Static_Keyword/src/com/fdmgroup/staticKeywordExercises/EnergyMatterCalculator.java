package com.fdmgroup.staticKeywordExercises;

public class EnergyMatterCalculator {

	public static final Double SPEED_OF_LIGHT = 299792458.0;

	public static double matterToEnergy(double matter) {
		System.out.println("Energy in Joules when mass given");
		return matter * (SPEED_OF_LIGHT * SPEED_OF_LIGHT);

	}

	public static double energyToMatter(double energy) {
		System.out.println("Matter when energy given");
		return SPEED_OF_LIGHT / (SPEED_OF_LIGHT * SPEED_OF_LIGHT);

	}


}

