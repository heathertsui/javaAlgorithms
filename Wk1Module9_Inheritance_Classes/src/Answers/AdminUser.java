package Answers;

public class AdminUser extends UserAccount{

	/**
	 * AdminUser constructor with 3 parameters
	 * @param username  the users name
	 * @param password	the password for the user 
	 * @param fullName	the users full name
	 */
	public AdminUser(String username, String password, String fullName) {
		super(username, password, fullName);

	}


	/**
	 * Overriden method from UserAccount
	 */
	@Override
	public void accessWebsite() {
		
		System.out.println("accessing website with admin rights");
		
	}

}
