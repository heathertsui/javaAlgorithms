package com.fdmgroup.interfacesExercise;

public class Laptop implements BasketItem {

	private String name;
	private double price;
	private double cpuSpeed;
	private double memory;
	private double hardDrive;

	public Laptop(String name, double price, double cpuSpeed, double memory, double hardDrive) {
		super();
		this.name = name;
		this.price = price;
		this.cpuSpeed = cpuSpeed;
		this.memory = memory;
		this.hardDrive = hardDrive;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName() {
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void setPrice() {
	}

	private double getCpuSpeed() {
		return cpuSpeed;
	}

	private void setCpuSpeed(double cpuSpeed) {
		this.cpuSpeed = cpuSpeed;
	}

	private double getMemory() {
		return memory;
	}

	private void setMemory(double memory) {
		this.memory = memory;
	}

	private double getHardDrive() {
		return hardDrive;
	}

	private void setHardDrive(double hardDrive) {
		this.hardDrive = hardDrive;
	}

}
