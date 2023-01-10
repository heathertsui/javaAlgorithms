package youtubeclass;

public class Main {

	public static void main(String[] args) {
		Class1 a = new Class1(); 	//class a created from class1 blueprint
		Class1 b = new Class1(); 	//class b created from class1 blueprint
		Class2 c = new Class2(); // () parentheses makes it a constructor which means it makes the object

		System.out.println(c.y);
		a.printHi();
		System.out.println(a.x);
		System.out.println(b.chars);

	}

}
