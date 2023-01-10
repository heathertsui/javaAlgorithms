package com.fdmgroup.polymorphismExercises;

public class AdminUser extends UserAccount {

	private static int minAdminPasswordLength;

	public AdminUser(String fullName, String username, String password) {
		super(username, password, fullName);

	}

	public static int getMinAdminPasswordLength() {
		return minAdminPasswordLength;
	}

	public static void setMinAdminPasswordLength(int minAdminPasswordLength) {
		AdminUser.minAdminPasswordLength = minAdminPasswordLength;
	}

}
