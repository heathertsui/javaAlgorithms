package com.fdmgroup.dependenciesExercises;

import java.util.ArrayList;

public class ComputerStore {
	private String name;
	private ArrayList<Computer> computers; // computers instance variable is an arraylist of type Computer


	public ComputerStore(String name) {
		this.name = name;

		computers = new ArrayList<>();
	}

	public void addComputer(Computer computer) {
		computers.add(computer);
	}

	public ArrayList<Computer> getAllComputers() {
		return computers;

	}

}



