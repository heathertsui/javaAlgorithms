package com.fdmgroup.classesAndObjectsExercises;

public class Runner {

	public static void main(String[] args) {
		Memory m1 = new Memory();
		Memory m2 = new Memory();
		Processor p1 = new Processor();
		Processor p2 = new Processor();
		HardDrive hdrive1 = new HardDrive();
		HardDrive hdrive2 = new HardDrive();

		// Hard drives
		// drive 1
		System.out.println("Hard drives: Drive 1");
		hdrive1.setMODEL("Seagate");
		hdrive1.setCAPACITY(2048.0);
		hdrive1.setUsedSpace(0.0);

		System.out.println(hdrive1.getMODEL());
		System.out.println(hdrive1.getCAPACITY());
		System.out.println(hdrive1.getusedSpace());

		// drive 2
		System.out.println("Hard drives: Drive 2");
		hdrive2.setMODEL("Dell");
		hdrive2.setCAPACITY(3072.0);
		hdrive2.setUsedSpace(500.0);

		System.out.println(hdrive2.getMODEL());
		System.out.println(hdrive2.getCAPACITY());
		System.out.println(hdrive2.getusedSpace());

		// Processors
		// processor 1
		System.out.println("Processors: processor 1");
		p1.setMODEL("Intel Xeon");
		p1.setNUMBER_OF_CORES(6);
		p1.setSPEED(2.93);

		System.out.println(p1.getMODEL());
		System.out.println(p1.getNUMBER_OF_CORES());
		System.out.println(p1.getSPEED());
		// processor 2
		System.out.println("Processors: processor 2");
		p2.setMODEL("Intel Celeron");
		p2.setNUMBER_OF_CORES(2);
		p2.setSPEED(2.9);

		System.out.println(p2.getMODEL());
		System.out.println(p2.getNUMBER_OF_CORES());
		System.out.println(p2.getSPEED());

		// Memory
		// memory 1
		System.out.println("Memory: memory 1");
		m1.setMODEL("Kingston");
		m1.setCAPACITY(4.0);
		m1.setSPEED(1600.0);

		System.out.println(m1.getMODEL());
		System.out.println(m1.getCAPACITY());
		System.out.println(m1.getSPEED());
		// memory 2
		System.out.println("Memory: memory 2");
		m2.setMODEL("Corsair");
		m2.setCAPACITY(8.0);
		m2.setSPEED(1333.0);

		System.out.println(m2.getMODEL());
		System.out.println(m2.getCAPACITY());
		System.out.println(m2.getSPEED());

		// 4. Change the value of drive1’s usedSpace variable by calling the
		// setUsedSpace() method passing in the value 50.
		hdrive1.setUsedSpace(50.0);
		System.out.println("hdrive 1 used space is now " + hdrive1.getusedSpace());
	}

}
