package Answers;

public class Runner {

	public static void main(String[] args) {
		
		AdminUser adminUser = new AdminUser("don", "chase", "donW");
		AdminUser adminUser2 = new AdminUser("Judy", "cocky", "JudyL");
		
		Customer customer = new Customer("Dave", "rocky", "DaveR");
		Customer customer2 = new Customer("John", "invalid password", "I cant remember my password");
		
		testChangePassword(customer, "mga", "mgb");	
		testChangePassword(customer, "mga", "mga");	
		
		
		adminUser.accessWebsite();
		customer2.accessWebsite();
		
		// Part 3
		
		UserAccountManager userAccountManager = new UserAccountManager();
		
		userAccountManager.addUser(adminUser);
		userAccountManager.addUser(adminUser2);
		userAccountManager.addUser(customer);
		userAccountManager.addUser(customer2);
		
		System.out.println("\nTest Login ");
		testLogin(userAccountManager);
		
		showLoginResult(userAccountManager, "don", "galah"); 


	}
	
	/**
	 * Test that the change password works in UserAccount
	 * @param account 	An instance of the UserAccount
	 * @param passwd1	First password entered
	 * @param passwd2	Second Password entered
	 */
	static void testChangePassword(UserAccount account, String passwd1, String passwd2) {
		
		if(account.changePassword(passwd1, passwd2) == false)
			System.out.println("Change of password was unsuccessful");
		else 
			System.out.println("Password changed successfully");
				
	}
	
	/**
	 * Login all the AcciuntUsers stored in the UserAccount instance and see if their login is successful.
	 * @param userAccountManager an instance of the AccountManager Class.
	 */
	static void testLogin(UserAccountManager userAccountManager) {
		
		for(UserAccount user: userAccountManager.getUserAccounts()) 
			showLoginResult(userAccountManager, user.getUsername(), user.getPassword()); 
		
	}
	
	/**
	 * SHoe the results of a login  attempt using the UserAccountManager login method 
	 * @param userAccountManager instance of the UserAccountManager Class
	 * @param userName	the user name to login
	 * @param password	the password for the user
	 */
	static void showLoginResult(UserAccountManager userAccountManager, String userName, String password) {
		
		if(userAccountManager.login(userName, password) == true)
			System.out.println(userName + " login successful");
		else {
			System.out.println(userName + " login failed");
		}		
		
	}

}
