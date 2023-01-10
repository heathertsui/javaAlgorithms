package com.fdmgroup.dependenciesExercises;

public class Computer {

	private String MODEL;
	private HardDrive hardDrive;
	private Memory memory;
	private Processor PROCESSOR;

	// Constructor for computer class
	public Computer(String model, HardDrive hardDrive, Memory memory, Processor processor) {
		MODEL = model;
		this.hardDrive = hardDrive;
		this.memory = memory;
		this.PROCESSOR = processor;
	}


	public String getMODEL() {
		return MODEL;
	}


	public HardDrive getHardDrive() {
		return hardDrive;
	}


	public Memory getMemory() {
		return memory;
	}


	public Processor getPROCESSOR() {
		return PROCESSOR;
	}




	public void turnOn() {
		System.out.println("turned on");
	}

	public void turnOff() {
		System.out.println("turned off");
	}

	public void getPower(PowerSource powersource) {
		PowerSource pwr = new PowerSource();
		System.out.println(pwr.supplyPower());

	}
}
