package com.app.health.testing;

import org.apache.log4j.Logger;
import org.owasp.esapi.ESAPI;
import org.owasp.esapi.errors.AuthenticationException;
import org.owasp.esapi.reference.crypto.JavaEncryptor;;

public class EsapiIntegrationTest {

	public static void main(String[] args)
	{
		System.out.println("ESAPI.accessController found: " 
                               + ESAPI.accessController());
		
		System.out.println(Thread
        .currentThread()
        .getContextClassLoader()
        .getResource(""));
		
		try {
			String username= "user";
			ESAPI.authenticator().createUser(username, "pAssw0rd", "pAssw0rd");
			System.out.println("Created user!");
			
			ESAPI.authenticator().getUser(username).enable();
			ESAPI.authenticator().getUser(username).unlock();
			
		} catch (AuthenticationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

