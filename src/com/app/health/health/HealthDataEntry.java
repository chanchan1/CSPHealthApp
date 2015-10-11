package com.app.health.health;

public class HealthDataEntry {

	private double height;
	private double weight;
	private String allergies;
	private double bloodSugar;
	private double cholesterolLevel;
	private BloodType bloodType;

	public HealthDataEntry(double height, double weight, String allergies, double bloodSugar, double cholesterolLevel,
			String bloodType) {
		super();
		this.height = height;
		this.weight = weight;
		this.allergies = allergies;
		this.bloodSugar = bloodSugar;
		this.cholesterolLevel = cholesterolLevel;
		this.setBloodType(bloodType);
	}

	@Override
	public String toString() {
		return "[H: " + this.height + ", W: " + this.weight + ", A: " + this.allergies + ", B: " + this.bloodSugar
				+ ", C: " + this.cholesterolLevel + ", BT: " + this.bloodType.name()+"]";
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public double getBloodSugar() {
		return bloodSugar;
	}

	public void setBloodSugar(double bloodSugar) {
		this.bloodSugar = bloodSugar;
	}

	public double getCholesterolLevel() {
		return cholesterolLevel;
	}

	public void setCholesterolLevel(double cholesterolLevel) {
		this.cholesterolLevel = cholesterolLevel;
	}

	public BloodType getBloodType() {
		return bloodType;
	}

	public void setBloodType(BloodType bloodType) {
		this.bloodType = bloodType;
	}

	public void setBloodType(String bloodType) {
		switch (bloodType) {
		case "A":
			this.bloodType = BloodType.A;
			break;
		case "B":
			this.bloodType = BloodType.B;
			break;
		case "AB":
			this.bloodType = BloodType.AB;
			break;
		case "0":
			this.bloodType = BloodType.ZERO;
			break;
		}
	}

}
