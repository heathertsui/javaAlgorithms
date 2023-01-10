package dataTypesModule3;

public class StagesofLife {

	public static void main(String[] args) {
		Integer stageOfLife = 13;
		{
			if (stageOfLife < 2) {
				System.out.println("You are a baby");
			} else if (stageOfLife >= 2 && stageOfLife < 4) {
				System.out.println("You are a child");
			} else if (stageOfLife >= 4 && stageOfLife < 13) {
				System.out.println("You are a toddler");
			} else if (stageOfLife >= 13 && stageOfLife < 20) {
				System.out.println("You are a teen");
			} else if (stageOfLife >= 20 && stageOfLife < 65) {
				System.out.println("You are an adult");
			} else {
				System.out.println("you are a pensioner");
			}
		}
	}
}