package com.fdmgroup.polymorphismExercises;

public class Runner {

	public static void main(String[] args) {

		AdminUser adminUser1 = new AdminUser("Marty B", "Mcfly", "dragon123");
		AdminUser adminUser2 = new AdminUser("Biff G", "BTD", "password123");

		Customer customer1 = new Customer("John", "Wayne", "paswod");
		Customer customer2 = new Customer("Jack", "Pato", "pswd");

		// Part 2.5
		System.out.println("Test 1, passwords match");
		testPassword(customer1, "newpass", "newpass");

		System.out.println("\nTest 2, passwords do not match");
		testPassword(customer2, "newpass", "ddnewpass");


		// Part 2.6

		adminUser1.accessWebsite();
		customer1.accessWebsite();

		// Part 3.5
		UserAccountManager userAcc = new UserAccountManager();
		userAcc.addUser(adminUser1);
		userAcc.addUser(adminUser2);
		userAcc.addUser(customer1);
		userAcc.addUser(customer2);

		// Part 3.6
		System.out.println("\nTest login method");
		// allAccountsLoop(userAcc);
		userAcc.login(adminUser1.getUsername(), adminUser1.getPassword());
		userAcc.login(adminUser2.getUsername(), adminUser2.getPassword());
		userAcc.login(adminUser1.getUsername(), adminUser2.getPassword());

	}

	/*
	 * Test for changePassword() works in UserAccount for objects created in
	 * AdminUser
	 * 
	 * @param account
	 * 
	 * @param newPass
	 * 
	 * @param confirmPass
	 * 
	 */

	public static void testPassword(UserAccount account, String newPass, String confirmPass) {
		if (account.changePassword(newPass, confirmPass))
			System.out.println("Password changed successfully");
		else
			System.out.println("Ensure passwords match");
	}

	/*
	 * Loops through array of userAccounts to get each userAcc and calls login
	 * method on each one
	 * 
	 */

	static void allAccountsLoop(UserAccountManager userAcc) {
		for (UserAccount user : userAcc.getUserAccounts()) {
			userAcc.login(user.getUsername(), user.getPassword());
		}
	}
//
//
//	static void loginMethod (UserAccountManager userAcc, String userName, String password ) {
//		if (userAcc.login(userName, password) == false )
//			System.out.println("Username and password of " + userName + " do not match");
//		else {
//			System.out.println("Username and password match, login successful");
//		}
//	}

}




