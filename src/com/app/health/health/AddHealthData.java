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

	public HealthDataEntry buildHealthDataEntryFromRequestParams(String height_s, String weight_s, String allergies_s,
			String bloodSugar_s, String cholesterolLevel_s, String bloodType_s) throws ParseException, IllegalArgumentException {
		NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);

		HealthDataEntry p = null;
		
		double height;
		if(height_s.contains(",")){ //1.0
			height = (double) nf.parse(height_s).doubleValue();
			System.out.format("%,2f", height);
		}else{//1
			height = (double) nf.parse(height_s).intValue();
		}
		if(height<0){
			throw new IllegalArgumentException("Height cannot be negative!");
		}else if(height==0){
			throw new IllegalArgumentException("Height cannot be zero!");
		}
		int weight = nf.parse(weight_s).intValue();
		String allergies = ESAPI.encoder().encodeForHTML(allergies_s);		
				
		double bloodSugar = (double) nf.parse(bloodSugar_s).intValue();
		double cholesterolLevel = (double) nf.parse(cholesterolLevel_s).intValue();
		String bloodType = bloodType_s;

		p = new HealthDataEntry(height, weight, allergies, bloodSugar, cholesterolLevel, bloodType);
		
		return p;
	}

}
