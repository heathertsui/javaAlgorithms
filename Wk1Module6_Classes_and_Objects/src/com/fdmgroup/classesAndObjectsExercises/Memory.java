package com.fdmgroup.classesAndObjectsExercises;

public class Memory {
	private String MODEL;
	private Double CAPACITY;
	private Double usedSpace;
	private Double SPEED;

	public String getMODEL() {
		return MODEL;
	}

	public void setMODEL(String mODEL) {
		MODEL = mODEL;
	}

	public Double getCAPACITY() {
		return CAPACITY;
	}

	public void setCAPACITY(Double cAPACITY) {
		CAPACITY = cAPACITY;
	}

	public Double getUsedSpace() {
		return usedSpace;
	}

	public void setUsedSpace(Double usedSpace) {
		this.usedSpace = usedSpace;
	}

	public Double getSPEED() {
		return SPEED;
	}

	public void setSPEED(Double sPEED) {
		SPEED = sPEED;
	}

//	public void Memory() {
//		System.out.println("Memory(String model, double capacity, double speed");
//	}

	public void storeData() {
		System.out.println("String data");
	}

}
