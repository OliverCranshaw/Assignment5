package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Farmer;

class FarmerTest {

	@Test
	public void setFarmerNameTest() {
		
		Farmer testFarmer = new Farmer();
		
		testFarmer.setFarmerName("Tester Farmer");
		
		assertEquals("Tester Farmer", testFarmer.getFarmerName());
		
		
	}
	
	@Test
	public void setFarmerAgeTest() {
		
		Farmer testFarmer = new Farmer();
		
		testFarmer.setFarmerAge("20");
		
		assertEquals("20", testFarmer.getFarmerAge());
	}

}
