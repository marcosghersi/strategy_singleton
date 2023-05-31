/**
 * 
 */
package com.company.login;

import com.company.login.model.LoginResult;
import com.company.login.model.User;

/**
 * @author mmartigh
 *
 */
public class LDAPAuthentication implements IAuthentication {

	@Override
	public LoginResult authenticate(User user) {
		LoginResult logged = new LoginResult(Boolean.TRUE, "Autenticacion por LDAP: " + user.toString());
		return logged;
	}

}
