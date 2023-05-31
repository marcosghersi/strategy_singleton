package com.company.login;

import com.company.login.model.LoginResult;
import com.company.login.model.User;

/** Authentication. */
public interface IAuthentication {
	
	public LoginResult authenticate(User user);

}
