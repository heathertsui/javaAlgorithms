package Answers;

public class Customer extends UserAccount{


	/**
	 * Consumer constructor with 3 parameters
	 * @param username  the users name
	 * @param password	the password for the user 
	 * @param fullName	the users full name
	 */

	public Customer(String username, String password, String fullName) {
		super(username, password, fullName);
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * Overriden method from UserAccount
	 */
	

	@Override
	public void accessWebsite() {
		System.out.println("accessing website as customer");
		
	}

}
