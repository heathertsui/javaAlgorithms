

public class firstCode {

	public static void main(String[] args) 
	{
	//1.1 Simple Message
		//String messagePrint = "Hello";
		//System.out.print(messagePrint);
	//1.2 Full name
		String firstName = "Heather";
		String secondName = "Tsui";
		String fullName = firstName + " " + secondName;
		//System.out.print(fullName);
//		Store a person’s name in a variable, and print a message to that
//		person. Your message should be simple, such as, “Hello Eric,
//		would you like to learn some Java today?”
	// 1.3 Personal message 
		String message = "Hello" + " " + fullName + ", would you like to learn some Java today?" + "\n";
		System.out.print(message);
	// 1.4 Name operations 
		int nameLength = firstName.length();
		System.out.print(nameLength);
		String upperCase = firstName.toUpperCase() + "\n";
		System.out.print(upperCase);
		System.out.print(firstName.charAt(0));
	
	}

}





