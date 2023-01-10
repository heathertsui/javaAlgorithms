package com.fdmgroup.dependenciesExercises;

public class Memory {
	private String Model;
	private Double CAPACITY;
	private Double usedSpace;
	private Double SPEED;

	public Memory(String model, double capacity, double speed) {
		Model = model;
		CAPACITY = capacity;
		SPEED = speed;
	}

	public String getModel() {
		return Model;
	}


	public Double getCAPACITY() {
		return CAPACITY;
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



//	public void Memory() {
//		System.out.println("Memory(String model, double capacity, double speed");
//	}

	public void storeData() {
		System.out.println("String data");
	}

}
