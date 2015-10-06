package com.testing;

public class Person {
	private String sFirstName;
	private String sLastName;
	private Integer iAge;
	
	public Person(String sFirstName, String sLastName, Integer iAge) {
		super();
		this.sFirstName = sFirstName;
		this.sLastName = sLastName;
		this.iAge = iAge;
	}


	public String getsFirstName() {
		return sFirstName;
	}

	public void setsFirstName(String sFirstName) {
		this.sFirstName = sFirstName;
	}

	public String getsLastName() {
		return sLastName;
	}

	public void setsLastName(String sLastName) {
		this.sLastName = sLastName;
	}

	public Integer getiAge() {
		return iAge;
	}

	public void setiAge(Integer iAge) {
		this.iAge = iAge;
	}

	@Override
	public String toString() {
		String person = this.sFirstName+" "+this.sLastName+" "+this.iAge.toString();
		return person;
	}



}
