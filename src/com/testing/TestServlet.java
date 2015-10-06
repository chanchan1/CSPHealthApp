package com.testing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/Test")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		
		Person p = new Person((String) request.getParameter("firstname"),(String) request.getParameter("lastname"), Integer.parseInt(request.getParameter("age")));
		
		Persons ps = (Persons)session.getAttribute("ps");
		if(ps!=null){
			ps.addPerson(p);
		}else{
			ArrayList<Person> newPs = new ArrayList<Person>(1);
			newPs.add(p);
			ps = new Persons(newPs);
		}
		session.setAttribute("ps", ps);
		request.getRequestDispatcher("Test.jsp").forward(request, response);
		//gives >null
		//response.getWriter().append((CharSequence) a);
	}

}
