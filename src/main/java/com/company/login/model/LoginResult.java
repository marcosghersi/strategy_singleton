/**
 * 
 */
package com.company.login.model;

/**
 * @author mmartigh
 *
 */
public class LoginResult {
	
	/** Result of authentication. */
	private boolean isAuthenticated;
	/** Login information. */
	private String message;
	
	/** Constructor with args. */
	public LoginResult(boolean isAuthenticated, String message) {
		super();
		this.isAuthenticated = isAuthenticated;
		this.message = message;
	}
	/**
	 * @return the isAuthenticated
	 */
	public boolean isAuthenticated() {
		return isAuthenticated;
	}
	/**
	 * @param isAuthenticated the isAuthenticated to set
	 */
	public void setAuthenticated(boolean isAuthenticated) {
		this.isAuthenticated = isAuthenticated;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "LoginResult [isAuthenticated=" + isAuthenticated + ", message=" + message + "]";
	}

}
