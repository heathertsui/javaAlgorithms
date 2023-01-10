package com.fdmgroup.dependenciesExercises;

import java.util.ArrayList;

public class Runner2 {

	public static void main(String[] args) {


		ArrayList<Computer> computers = new ArrayList<>();
		PowerSource powerSource = new PowerSource();
		powerSource.watts = 100.0;
		
		HardDrive hardDrive = new HardDrive("Seagate", 2);
		hardDrive.setUsedSpace(50.0);
		hardDrive.getusedSpace();
		
		Processor processor = new Processor("Intel Xeon", 2.93, 6);
		
		Memory memory = new Memory("Kingston", 4, 1600);
	
		
		Computer computer = new Computer("Dell", hardDrive, memory, processor);
		
		
		// Create a second Computer
		
		HardDrive hardDrive2 = new HardDrive("Western Digital", 4);
		hardDrive.setUsedSpace(0.0);
		hardDrive.getusedSpace();
		
		Processor processor2 = new Processor("Intel i10", 3.93, 8);
		
		Memory memory2 = new Memory("Intel", 4, 3333);
			

		ComputerStore computerStore = new ComputerStore("My Computer Store");
		
		computerStore.addComputer(computer);
		computerStore.addComputer(new Computer("HP", hardDrive2, memory2, processor2));
		
		computers = computerStore.getAllComputers(); 
		
		for(Computer computer2 : computers)
			System.out.println(
					computer2.getMODEL() + "\n" + computer2.getHardDrive().getMODEL() + 
					"\n" + computer2.getPROCESSOR().getMODEL() + "\n" + 
					computer2.getMemory().getModel() + "\n"
			);

		powerSource.setWatts(1.2);
		computer.getPower(powerSource);
		
	}

}
