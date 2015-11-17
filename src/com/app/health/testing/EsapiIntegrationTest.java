package com.app.health.testing;

import org.apache.log4j.Logger;
import org.owasp.esapi.ESAPI;

public class EsapiIntegrationTest {

	public static void main(String[] args)
	{
		System.out.println("ESAPI.accessController found: " 
                               + ESAPI.accessController());
	}
}

