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
	public void testNegativeCommaHeight() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("-1,2", "1", "a", "1,1", "1,1", "A");
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeHeight() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("-1", "1", "a", "1,1", "1,1", "A");
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
	@Test(expected = IllegalArgumentException.class)
	public void testNullHeight() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams(null, "1", "a", "1,1", "1,1", "A");
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
	@Test(expected = IllegalArgumentException.class)
	public void testPointHeight() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("1.0", "1", "a", "1,1", "1,1", "A");
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
	public void testNegativeCommaWeight() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("1,0", "-1,2", "a", "1,1", "1,1", "A");
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeWeight() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("1,0", "-1", "a", "1,1", "1,1", "A");
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testZeroWeight() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("1,0", "0", "a", "1,1", "1,1", "A");
			
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testZeroCommaWeight() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("1,0", "0,0", "a", "1,1", "1,1", "A");
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCharWeight() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("1,0", "a", "a", "1,1", "1,1", "A");
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
	@Test(expected = IllegalArgumentException.class)
	public void testEmptyWeight() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("1,0", "", "a", "1,1", "1,1", "A");
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
	@Test(expected = IllegalArgumentException.class)
	public void testNullWeight() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("1,0", null, "a", "1,1", "1,1", "A");
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
	@Test(expected = IllegalArgumentException.class)
	public void testPointWeight() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("1,0", "1.0", "a", "1,1", "1,1", "A");
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
	@Test
	public void testIntegerWeight() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("1,0", "1", "a", "1,1", "1,1", "A");
			Assert.assertTrue(Math.abs(healthData.getHeight()-1.0) <= 0.000001);
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeCommaBloodSugar() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("1,0", "1,0", "a", "-1,1", "1,1", "A");
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeBloodSugar() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("1,0", "1,0", "a", "-1", "1,1", "A");
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testZeroBloodSugar() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("1,0", "1,0", "a", "0", "1,1", "A");
			
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testZeroCommaBloodSugar() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("1,0", "1,0", "a", "0,0", "1,1", "A");
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCharBloodSugar() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("1,0", "1,0", "a", "a", "1,1", "A");
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
	@Test(expected = IllegalArgumentException.class)
	public void testEmptyBloodSugar() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("1,0", "1,0", "a", "", "1,1", "A");
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
	@Test(expected = IllegalArgumentException.class)
	public void testNullBloodSugar() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("1,0", "1,0", "a",null, "1,1", "A");
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
	@Test(expected = IllegalArgumentException.class)
	public void testPointBloodSugar() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("1,0", "1,0", "a", "1.0", "1,1", "A");
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
	@Test
	public void testIntegerBloodSugar() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("1,0", "1,0", "a", "1", "1,1", "A");
			Assert.assertTrue(Math.abs(healthData.getHeight()-1.0) <= 0.000001);
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
	@Test(expected = IllegalArgumentException.class)
	public void testQuoteAllergies() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("1,0", "1,0", "\"", "1", "1,1", "A");
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
	@Test(expected = IllegalArgumentException.class)
	public void testEqualsAllergies() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("1,0", "1,0", "=;", "1", "1,1", "A");
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
	@Test(expected = IllegalArgumentException.class)
	public void testPlainJSAllergies() {
		HealthDataEntry healthData;
		try {
			healthData = addHDClass.buildHealthDataEntryFromRequestParams("1,0", "1,0", "<script>alert(\"bad!\")</script>", "1", "1,1", "A");
		} catch (ParseException e) {
			fail("Shouldn't raise any format errors!");
		}
	}
}
