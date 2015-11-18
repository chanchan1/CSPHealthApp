package com.app.health.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.owasp.esapi.ESAPI;
import org.owasp.esapi.Logger;
import org.owasp.esapi.errors.AuthenticationException;
import org.owasp.esapi.errors.ValidationException;
import org.owasp.esapi.reference.DefaultUser;

/**
 * Servlet implementation class DoUserLogout
 */
@WebServlet("/DoUserLogin")
public class DoUserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoUserLogin() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ESAPI.httpUtilities().setCurrentHTTP(request, response);
		
		String requestedURI = request.getRequestURI();
		ESAPI.getLogger("DoUserLogin").info(Logger.EVENT_UNSPECIFIED, requestedURI);
		String username= "user";
		/*
		try {
			ESAPI.authenticator().createUser(username, "pAssw0rd", "pAssw0rd");
		} catch (AuthenticationException e1) {
			e1.printStackTrace();
		}*/
		ESAPI.authenticator().getUser(username).enable();
		ESAPI.authenticator().getUser(username).unlock();
		
		try {
			DefaultUser  user = (DefaultUser) ESAPI.authenticator().login(request, response);
			
		} catch (AuthenticationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			response.sendRedirect(ESAPI.httpUtilities().getHeader("Referer"));
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
