/**
 * 
 */
package com.company.login;

import java.util.ResourceBundle;

import com.company.login.model.LoginTypes;
import com.company.login.model.User;

/**
 * @author mmartigh
 *
 */
public class AuthenticationFactory {
	
	/** Instancia unica de la clase. */
	private static AuthenticationFactory instance;
	
	/** Acceso a la implementacion a cargar desde un properties. */
	private final String autenticationLDAP = ResourceBundle.getBundle("application").getString("authentication.class.ldap");
	
	/** Acceso a la implementacion a cargar desde un properties. */
	private final String autenticationDB = ResourceBundle.getBundle("application").getString("authentication.class.db");
	
	/** Constructor que solo puede ser invocado por la propia clase.*/
	private AuthenticationFactory() {		
	}
	/** Implementacion de singleton para devolver una instancia unica.*/
	public static final AuthenticationFactory getInstance() {
		if(instance == null)
		{
			instance = new AuthenticationFactory();
		}
		
		return instance;
	}

	/** Metodo para crear un objeto de una de las
	 * implementaciones de IAuthentication
	 * @param user to authenticate
	 * @return Un objeto de una de las
	 * implementaciones de IAuthentication
	 */
	public IAuthentication createAutenticator(User user) {
		
		//Se accede al ClassLoader
		ClassLoader cl = this.getClass().getClassLoader();
		
		IAuthentication authenticator = null;
		try {
			Class autenticatorClass	=  null;
			if(LoginTypes.DB.equals(user.getLoginTypes()))
			{
				autenticatorClass = cl.loadClass(this.autenticationDB);
			}else if(LoginTypes.LDAP.equals(user.getLoginTypes()))
			{
				autenticatorClass = cl.loadClass(this.autenticationLDAP);
			}
			else
			{
				autenticatorClass = cl.loadClass(this.autenticationDB);
			}
			//Se crea una instancia, un objeto, de la implementacion del tipo IAuthentication
			authenticator = (IAuthentication)autenticatorClass.newInstance();
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return authenticator;
		
	}
}
