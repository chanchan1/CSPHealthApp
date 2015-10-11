package com.app.health.health;

import java.util.List;

public class HealthDataEntries {
	
	private List<HealthDataEntry> entries;

	public List<HealthDataEntry> getEntries() {
		return entries;
	}

	public HealthDataEntries(List<HealthDataEntry> entries) {
		super();
		this.entries = entries;
	}

	public void setEntries(List<HealthDataEntry> entries) {
		this.entries = entries;
	}

	public void addEntry(HealthDataEntry entry){
		this.entries.add(entry);
	}
}
