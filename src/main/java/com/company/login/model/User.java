package com.company.login.model;

public class User {
	
	/** name. */
	private String name;
	
	/** 
	 * Constructor con argumentos.
	 * 
	 * @param name
	 * @param pass
	 * @param loginTypes
	 */
	public User(String name, String pass, LoginTypes loginTypes) {
		super();
		this.name = name;
		this.pass = pass;
		this.loginTypes = loginTypes;
	}

	/** pass. */
	private String pass;
	
	/** Login Type. */
	private LoginTypes loginTypes;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}

	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}

	/**
	 * @return the loginTypes
	 */
	public LoginTypes getLoginTypes() {
		return loginTypes;
	}

	/**
	 * @param loginTypes the loginTypes to set
	 */
	public void setLoginTypes(LoginTypes loginTypes) {
		this.loginTypes = loginTypes;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", pass=" + pass + ", loginTypes=" + loginTypes.toString() + "]";
	}

}
