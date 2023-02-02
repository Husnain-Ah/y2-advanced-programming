package uk.ac.mmu.advprog.TDDLab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EVBatteryManagerTest {

	
	@Test
	void testDefaultConstructor() {
		EVBatteryManager ebm = new EVBatteryManager();
		
		assertEquals(0, ebm.getBatteryCapacity());
		assertEquals(0,ebm.getChargeLevel());
		assertEquals(0,ebm.getReservePowerLevel());
	}
	
	@Test
	void testConvenienceConstructor() {
		EVBatteryManager ebm = new EVBatteryManager(275,100,10);
		
		assertEquals(275,ebm.getBatteryCapacity());
		assertEquals(100,ebm.getChargeLevel());
		assertEquals(10,ebm.getReservePowerLevel());
	}
	
	@Test
	void testInvalidChargeLevelConstructorPositive() {
		try {
			EVBatteryManager ebm = new EVBatteryManager(275,100.1,10);
		}
		catch (IllegalArgumentException e) {
			//test passes
		}
		fail("No Exception thrown on invalid charge level in constructor");
	}
	
	@Test
	void testInvalidChargeLevelConstructorNegative() {
		try {
			EVBatteryManager ebm = new EVBatteryManager(275,-0.1,10);
		}
		catch (IllegalArgumentException e) {
			//test passes
		}
		fail("No Exception thrown on invalid charge level in constructor");
	}
	
	@Test
	void testInvalidReserveConstructorPositive() {
		try {
			EVBatteryManager ebm = new EVBatteryManager(275,100,100.1);
		}
		catch (IllegalArgumentException e) {
			//test passes
		}
		fail("No Exception thrown on invalid charge level in constructor");
	}
	
	@Test
	void testInvalidReserveConstructorNegative() {
		try {
			EVBatteryManager ebm = new EVBatteryManager(275,100,-0.1);
		}
		catch (IllegalArgumentException e) {
			//test passes
		}
		fail("No Exception thrown on invalid charge level in constructor");
	}
	
	@Test
	void testSetJourneyInfo() {
		EVBatteryManager ebm = new EVBatteryManager(275,90,10);
		
		ebm.setJourneyInfo(100, 20);
		assertEquals(100,ebm.getStartJourneyChargeLevel());
		assertEquals(20,ebm.getJourneyMilesTravelled());
	}
	
	@Test
	void testInvalidStartJourneyChargeLevelSetJourneyInfoPositive() {
		try {
			EVBatteryManager ebm = new EVBatteryManager(275,90,10);
			
			ebm.setJourneyInfo(100.1, 20);
			fail("No exception thrown on invalid charge level in setJourneyInfo");
		}
		catch (IllegalArgumentException e) {
			//test passes
		}
	}
	
	@Test
	void testInvalidStartJourneyChargeLevelSetJourneyInfoNegative() {
		try {
			EVBatteryManager ebm = new EVBatteryManager(275,90,10);
			
			ebm.setJourneyInfo(-0.1, 20);
			fail("No exception thrown on invalid charge level in setJourneyInfo");
		}
		catch (IllegalArgumentException e) {
			//test passes
		}
	}
	
	@Test
	void testInvalidMileageSetJourneyInfoNegative() {
		try {
			EVBatteryManager ebm = new EVBatteryManager(275,90,10);
			
			ebm.setJourneyInfo(100, -1);
			fail("No exception thrown on invalid charge level in setJourneyInfo");
		}
		catch (IllegalArgumentException e) {
			//test passes
		}
	}
	
	@Test
	void testSetChargingInfo() {
		EVBatteryManager ebm = new EVBatteryManager(275,90,10);
		
		ebm.setChargingInfo(100, 7.2, 86.2);
		
		assertEquals(100,ebm.getTargetChargeLevel());
		assertEquals(7.2,ebm.getChargerPower());
		assertEquals(86.2,ebm.getChargingEfficiency());
	}
	
	@Test
	void testInvalidTargetChargeLevelSetChargingInfoPositive() {
		try {
			EVBatteryManager ebm = new EVBatteryManager(275,90,10);
			
			ebm.setChargingInfo(100.1, 7.2, 86.2);
			fail("No exception thrown on invalid charge level in setChargingInfo");
		}
		catch (IllegalArgumentException e) {
			//test passes
		}
	}
	
	@Test
	void testInvalidTargetChargeLevelSetChargingInfoNegative() {
		try {
			EVBatteryManager ebm = new EVBatteryManager(275,90,10);
			
			ebm.setChargingInfo(-0.1, 7.2, 86.2);
			fail("No exception thrown on invalid charge level in setChargingInfo");
		}
		catch (IllegalArgumentException e) {
			//test passes
		}
	}
	
	@Test
	void testInvalidChargerPowerSetChargingInfoNegative() {
		try {
			EVBatteryManager ebm = new EVBatteryManager(275,90,10);
			
			ebm.setChargingInfo(100, -7.2, 86.2);
			fail("No exception thrown on invalid charger power in setChargingInfo");
		}
		catch (IllegalArgumentException e) {
			//test passes
		}
	}
	
	@Test
	void testInvalidEfficiencySetChargingInfoPositive() {
		try {
			EVBatteryManager ebm = new EVBatteryManager(275,90,10);
			
			ebm.setChargingInfo(100, 7.2, 100.1);
			fail("No exception thrown on invalid efficiency value in setChargingInfo");
		}
		catch (IllegalArgumentException e) {
			//test passes
		}
	}
	
	@Test
	void testInvalidEfficiencySetChargingInfoNegative() {
		try {
			EVBatteryManager ebm = new EVBatteryManager(275,90,10);
			
			ebm.setChargingInfo(100, 7.2, -0.1);
			fail("No exception thrown on invalid efficiency value in setChargingInfo");
		}
		catch (IllegalArgumentException e) {
			//test passes
		}
	}
	
	@Test
	void testRangeCalculation() {
		EVBatteryManager ebm = new EVBatteryManager(275,90,10);
		ebm.setJourneyInfo(100, 20.2);
		
		assertEquals(161.6,ebm.getEstimatedRemainingRange(),0.1); //allows 0.1 miles of leeway for rounding
	}
	
	@Test
	void testRangeCalculationStartingCharge() {
		EVBatteryManager ebm = new EVBatteryManager(275,90,10);
		ebm.setJourneyInfo(98, 20.2);
		
		assertEquals(202.0,ebm.getEstimatedRemainingRange(),0.1); //allows 0.1 miles of leeway for rounding
	}
	
	@Test
	void testRangeCalculationReserve() {
		EVBatteryManager ebm = new EVBatteryManager(275,90,20);
		ebm.setJourneyInfo(100, 20.2);
		
		assertEquals(141.4,ebm.getEstimatedRemainingRange(),0.1); //allows 0.1 miles of leeway for rounding
	}
	
	@Test 
	void testChargingTimeCalculation() {
		EVBatteryManager ebm = new EVBatteryManager(275,90,10);
		ebm.setChargingInfo(100, 7.2, 86.2);
		
		assertEquals(266, ebm.getEstimatedChargingTime(),1); //allows 1 minute of leeway for rounding
	}
	
	@Test 
	void testChargingTimeCalculationEffiiency() {
		EVBatteryManager ebm = new EVBatteryManager(275,90,10);
		ebm.setChargingInfo(100, 7.2, 72.2);
		
		assertEquals(317, ebm.getEstimatedChargingTime(),1); //allows 1 minute of leeway for rounding
	}
	
	@Test 
	void testChargingTimeCalculationNotToFull() {
		EVBatteryManager ebm = new EVBatteryManager(275,90,10);
		ebm.setChargingInfo(95, 7.2, 86.2);
		
		assertEquals(133, ebm.getEstimatedChargingTime(),1); //allows 1 minute of leeway for rounding
	}
	
	@Test 
	void testChargingTimeCalculationSupercharger() {
		EVBatteryManager ebm = new EVBatteryManager(275,70,10);
		ebm.setChargingInfo(100, 150, 91);
		
		assertEquals(36, ebm.getEstimatedChargingTime(),1); //allows 1 minute of leeway for rounding
	}
	

}
