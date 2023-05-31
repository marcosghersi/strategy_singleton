package com.company.login;

import com.company.login.model.LoginResult;
import com.company.login.model.LoginTypes;
import com.company.login.model.User;

public class LoginApplication {

	public static void main(String[] args) {
		
		AuthenticationFactory aFactory = AuthenticationFactory.getInstance();
		
		User user1 = new User("Pepe", "passPepe", LoginTypes.DB);
		User user2 = new User("Ana", "passAna", LoginTypes.LDAP);
		
		IAuthentication authenticator1 = aFactory.createAutenticator(user1);
		
		LoginResult result = authenticator1.authenticate(user1);
		
		System.out.println("LOGIN RESULT 1: " + result.toString());
		
		IAuthentication authenticator2 = aFactory.createAutenticator(user2);
		
		result = authenticator2.authenticate(user2);
		
		System.out.println("LOGIN RESULT 2: " + result.toString());
		
	}

}
