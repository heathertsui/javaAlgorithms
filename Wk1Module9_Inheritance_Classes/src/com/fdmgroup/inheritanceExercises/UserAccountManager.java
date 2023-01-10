package com.fdmgroup.inheritanceExercises;

import java.util.ArrayList;

public class UserAccountManager {

	private ArrayList<UserAccount> userAccounts = new ArrayList<UserAccount>();

	public void addUser(UserAccount user) {
		userAccounts.add(user);
	}

	public boolean login(String username, String password) {

		boolean match = false;

		for (UserAccount acc : userAccounts) {
			if (acc.getUsername().equals(username) && acc.getPassword().equals(password)) {
				match = true;
				System.out.println("Username and Password Match");
				break;
			}

		}
		return match;
	}


	public ArrayList<UserAccount> getUserAccounts() {
		return userAccounts;
	}
}
