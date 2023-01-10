package Answers;

import java.util.ArrayList;

public class UserAccountManager{

	ArrayList<UserAccount> userAccounts = new ArrayList<UserAccount>();
	
	public void addUser(UserAccount user) {
		
		userAccounts.add(user);
	}
	
	public boolean login(String username, String password) {
		
		boolean retval = false;
		
		for (UserAccount user : userAccounts) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				retval = true;
				break;				// best option here
			}
			
		}
		
		return retval;	
		
	}
	
	/**
	 * Not in Exercise question but makes neater for 3.6
	 * @return
	 */
	
	public ArrayList<UserAccount> getUserAccounts() {
		return userAccounts;
	}
	
	

}
