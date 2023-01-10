package com.fdmgroup.dependenciesExercises;

public class Processor {
	private String MODEL;
	private Double SPEED;
	private int NUMBER_OF_CORES;

	public Processor(String model, double speed, int numberOfCores) {
		MODEL = model;
		SPEED = speed;
		NUMBER_OF_CORES = numberOfCores;
	}

	public String getMODEL() {
		return MODEL;
	}


	public Double getSPEED() {
		return SPEED;
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

	public void processData(String data) {
		System.out.println("String data" + data);

	}

}
