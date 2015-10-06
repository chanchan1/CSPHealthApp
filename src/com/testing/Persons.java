package com.testing;

import java.util.List;

public class Persons {
	private List<Person> lPersons;
	
	public Persons(List<Person> lPersons) {
		super();
		this.lPersons = lPersons;
	}

	public List<Person> getlPersons() {
		return lPersons;
	}

	public void setlPersons(List<Person> lPersons) {
		this.lPersons = lPersons;
	}

	public void addPerson(Person person) {
		this.lPersons.add(person);
	}
	

}
