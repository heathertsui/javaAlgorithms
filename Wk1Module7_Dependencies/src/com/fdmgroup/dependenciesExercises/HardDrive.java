package com.fdmgroup.dependenciesExercises;

public class HardDrive {
	private String MODEL;
	private Double CAPACITY;
	private Double usedSpace;

	public HardDrive(String model, double capacity) {
		MODEL = model;
		CAPACITY = capacity;

	}

	public String getMODEL() { // this is the getter
		return MODEL;
	}


	public Double getCAPACITY() {
		return CAPACITY;
	}


	public Double getusedSpace() {
		return usedSpace;
	}

	public void setUsedSpace(Double usedSpace) {
		this.usedSpace = usedSpace;
	}



//	public void HardDrive() {
//		System.out.println("method: HardDrive, value of arguments: String model, double capacity ");
//	}

	public String readData(String file) {
		return ("data from " + file);
	}

	public void writeData() {
	}

}
