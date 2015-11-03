package com.app.health.testing;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.app.health.health.AddHealthData;
import com.app.health.health.HealthDataEntry;

public class AddHealthDataTest {
	private static AddHealthData addHDClass;

	@BeforeClass
	public static void setUp() throws Exception {
		addHDClass = new AddHealthData();
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNegativeHeight() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("-1,2", "1", "a", "1,1", "1,1", "A");
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}

	@Test
	public void testIntegerHeight() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("1", "1", "a", "1,1", "1,1", "A");
			Assert.assertTrue(Math.abs(healthData.getHeight()-1.0) <= 0.000001);
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testZeroHeight() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("0", "1", "a", "1,1", "1,1", "A");
			
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testZeroCommaHeight() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("0,0", "1", "a", "1,1", "1,1", "A");
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCharHeight() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("a", "1", "a", "1,1", "1,1", "A");
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
	@Test(expected = IllegalArgumentException.class)
	public void testEmptyHeight() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("", "1", "a", "1,1", "1,1", "A");
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
}
