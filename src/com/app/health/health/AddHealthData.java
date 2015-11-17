package com.app.health.health;

import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.owasp.esapi.ESAPI;


/**
 * Servlet implementation class AddHealthData
 */
@WebServlet("/AddHealthData")
public class AddHealthData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final static Logger logger = Logger.getLogger(AddHealthData.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddHealthData() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Add form data to health data

		HttpSession session = request.getSession();
		session.removeAttribute("error");
		try {
			HealthDataEntry p = buildHealthDataEntryFromRequestParams(request.getParameter("height"),
					request.getParameter("weight"), request.getParameter("allergies"),
					request.getParameter("bloodSugar"), request.getParameter("cholesterolLevel"),
					request.getParameter("bloodType"));

			HealthDataEntries entries = (HealthDataEntries) session.getAttribute("healthData");
			if (entries != null) {
				entries.addEntry(p);
			} else {
				ArrayList<HealthDataEntry> newHealthData = new ArrayList<HealthDataEntry>(1);
				newHealthData.add(p);
				entries = new HealthDataEntries(newHealthData);
			}
			session.setAttribute("healthData", entries);
		} catch (IllegalArgumentException e) {
			session.setAttribute("error", e.getMessage());
		} catch (ParseException e) {
			session.setAttribute("error", "Couldn't parse parameters!");
		}
		request.getRequestDispatcher("Health.jsp").forward(request, response);
	}
	
	public boolean isString(String input) {
		try {
			NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
			nf.parse(input).doubleValue();
			return false;
		}
		catch(Exception b) {
			return true;
		}
	}
	
	public double validateDoubleInput(String input_s) throws ParseException, IllegalArgumentException {
		NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
		
		
		double input = nf.parse(input_s).doubleValue();
		
		if(input > 0) {
			System.out.println(input);
		}else if(input < 0){
			throw new IllegalArgumentException("You entered a negative value.");
		}else if(input == 0){
			throw new IllegalArgumentException("Values cannot be zero.");
		}
		
		return input;
	}
	
	public BloodType validateEnumInput(String input_s) throws IllegalArgumentException {
		BloodType input = null;
		switch(input_s){
			case "A": input = BloodType.A; break;
			case "B": input = BloodType.B; break;
			case "AB": input = BloodType.AB; break;
			case "0": input = BloodType.ZERO; break;
			default: throw new IllegalArgumentException("Nice try :-)");
		}		
		return input;
	}
	
	public HealthDataEntry buildHealthDataEntryFromRequestParams(String height_s, String weight_s, String allergies_s,
			String bloodSugar_s, String cholesterolLevel_s, String bloodType_s) throws ParseException, IllegalArgumentException {

		HealthDataEntry p = null;
		
		double height = validateDoubleInput(height_s);
		
		double weight = validateDoubleInput(weight_s);
				
		String allergies;
		if(isString(allergies_s)) {
			allergies = ESAPI.encoder().encodeForHTML(allergies_s);		
		}else{
			throw new IllegalArgumentException("Allergies cannot be numbers!");
		}
		
		double bloodSugar = validateDoubleInput(bloodSugar_s);
		
		double cholesterolLevel = validateDoubleInput(cholesterolLevel_s);

		String bloodType = bloodType_s;

		p = new HealthDataEntry(height, weight, allergies, bloodSugar, cholesterolLevel, bloodType);
		
		return p;
	}

}
