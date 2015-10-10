package com.app.health.health;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.testing.Person;
import com.testing.Persons;

/**
 * Servlet implementation class AddHealthData
 */
@WebServlet("/AddHealthData")
public class AddHealthData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddHealthData() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Add form data to health data
		
		HttpSession session = request.getSession();
		
		double height = (double) Double.parseDouble(request.getParameter("height"));
		double weight= (double) Double.parseDouble(request.getParameter("height"));
		String allergies =request.getParameter("allergies");
		double bloodSugar=(double) Double.parseDouble(request.getParameter("height"));
		double cholesterolLevel=(double) Double.parseDouble(request.getParameter("height"));
		String bloodType =request.getParameter("bloodType");
		
		HealthDataEntry p = new HealthDataEntry(height,weight,allergies,bloodSugar, cholesterolLevel,bloodType);
		
		HealthDataEntries entries = (HealthDataEntries)session.getAttribute("healthData");
		if(entries!=null){
			entries.addEntry(p);
		}else{
			ArrayList<HealthDataEntry> newHealthData = new ArrayList<HealthDataEntry>(1);
			newHealthData.add(p);
			entries = new HealthDataEntries(newHealthData);
		}
		session.setAttribute("healthData", entries);
		request.getRequestDispatcher("Health.jsp").forward(request, response);
	}

}
