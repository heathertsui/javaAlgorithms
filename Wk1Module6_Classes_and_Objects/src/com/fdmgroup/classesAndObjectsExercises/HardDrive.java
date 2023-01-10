package com.fdmgroup.classesAndObjectsExercises;

public class HardDrive {
	private String MODEL;
	private Double CAPACITY;
	private Double usedSpace;

	public String getMODEL() { // this is the getter
		return MODEL;
	}

	public void setMODEL(String MODEL) { // this is the setter
		this.MODEL = MODEL;
	}

	public Double getCAPACITY() {
		return CAPACITY;
	}

	public void setCAPACITY(Double CAPACITY) {
		this.CAPACITY = CAPACITY;
	}

	public Double getusedSpace() {
		return usedSpace;
	}

	public void setUsedSpace(Double usedSpace) {
		this.usedSpace = usedSpace;
	}

	public void hardDrive() {
	}

//	public void HardDrive() {
//		System.out.println("method: HardDrive, value of arguments: String model, double capacity ");
//	}

	public void readData() {
		System.out.println("method: readData, value of argument: String. Data from ");
	}

	public void writeData() {
		System.out.println("method: writeData, value of argument: String data, String file");
	}

}
