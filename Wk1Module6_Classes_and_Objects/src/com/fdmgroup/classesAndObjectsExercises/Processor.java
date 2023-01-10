package com.fdmgroup.classesAndObjectsExercises;

public class Processor {
	private String MODEL;
	private Double SPEED;
	private int NUMBER_OF_CORES;

	public String getMODEL() {
		return MODEL;
	}

	public void setMODEL(String mODEL) {
		this.MODEL = mODEL;
	}

	public Double getSPEED() {
		return SPEED;
	}

	public void setSPEED(Double sPEED) {
		this.SPEED = sPEED;
	}

	public int getNUMBER_OF_CORES() {
		return NUMBER_OF_CORES;
	}

	public void setNUMBER_OF_CORES(int nUMBER_OF_CORES) {
		this.NUMBER_OF_CORES = nUMBER_OF_CORES;
	}

//	public void Processor() {
//		System.out.println("Processor(String model, double speed, int numberOfCores)");
//	}

	public void processData() {
		System.out.println("String data");

	}

}
