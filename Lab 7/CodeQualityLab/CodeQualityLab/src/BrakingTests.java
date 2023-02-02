/**
 * 
 * @author Husnain
 *
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrakingTests {

	@Test
	void speedTest() { 
		try {
			BrakingDistanceEstimator a = new BrakingDistanceEstimator(BrakingConditions.WEATHER_DRY,BrakingConditions.LOADING_DRIVERONLY,BrakingConditions.BRAKES_WARM);
			
			assertTrue(a.getBrakingDistanceFor(10) < a.getBrakingDistanceFor(60));
		}
		catch(Exception e) {
			fail("Exception: " + "e");
		}
	}
	
	@Test
	void dryVersusWetTest() { // valid data
		try {
			BrakingDistanceEstimator dry = new BrakingDistanceEstimator(BrakingConditions.WEATHER_DRY,BrakingConditions.LOADING_DRIVERONLY,BrakingConditions.BRAKES_WARM);
			BrakingDistanceEstimator wet = new BrakingDistanceEstimator(BrakingConditions.WEATHER_WET,BrakingConditions.LOADING_DRIVERONLY,BrakingConditions.BRAKES_WARM);
			
			
			assertTrue(dry.getBrakingDistanceFor(100) < wet.getBrakingDistanceFor(100));
		}
		catch(Exception e) {
			fail("Exception: " + "e");
		}
		
		
	}
	
	@Test
	void dampVersusSnowTest() { // valid data
		try {
			BrakingDistanceEstimator damp = new BrakingDistanceEstimator(BrakingConditions.WEATHER_DAMP,BrakingConditions.LOADING_DRIVERONLY,BrakingConditions.BRAKES_WARM);
			BrakingDistanceEstimator snow = new BrakingDistanceEstimator(BrakingConditions.WEATHER_SNOW,BrakingConditions.LOADING_DRIVERONLY,BrakingConditions.BRAKES_WARM);
			
			
			assertTrue(damp.getBrakingDistanceFor(100) < snow.getBrakingDistanceFor(100));
		}
		catch(Exception e) {
			fail("Exception: " + "e");
		}
		
		
	}
	
	@Test
	void invalidWeatherTest() { 
		try {
			BrakingDistanceEstimator invalid = new BrakingDistanceEstimator(9,BrakingConditions.LOADING_DRIVERONLY,BrakingConditions.BRAKES_WARM);
			BrakingDistanceEstimator snow = new BrakingDistanceEstimator(BrakingConditions.WEATHER_SNOW,BrakingConditions.LOADING_DRIVERONLY,BrakingConditions.BRAKES_WARM);
			
			assertTrue(invalid.getBrakingDistanceFor(100) < snow.getBrakingDistanceFor(100));
		}
		catch(Exception e) {
			fail("Exception: " + "e");
		}
	}
	
	@Test
	void fullVersusPassengerTest() { // valid data
		try {
			BrakingDistanceEstimator full = new BrakingDistanceEstimator(BrakingConditions.WEATHER_DAMP,BrakingConditions.LOADING_FULL,BrakingConditions.BRAKES_WARM);
			BrakingDistanceEstimator passenger = new BrakingDistanceEstimator(BrakingConditions.WEATHER_SNOW,BrakingConditions.LOADING_DRIVER_PASSENGER,BrakingConditions.BRAKES_WARM);
			
			
			assertTrue(full.getBrakingDistanceFor(100) < passenger.getBrakingDistanceFor(100));
		}
		catch(Exception e) {
			fail("Exception: " + "e");
		}
	}
	
	@Test
	void invalidPassengerTest() { // valid data
		try {
			BrakingDistanceEstimator invalid = new BrakingDistanceEstimator(BrakingConditions.WEATHER_DAMP,6,BrakingConditions.BRAKES_WARM);
			BrakingDistanceEstimator passenger = new BrakingDistanceEstimator(BrakingConditions.WEATHER_DAMP,BrakingConditions.LOADING_DRIVER_PASSENGER,BrakingConditions.BRAKES_WARM);
			
			
			assertTrue(invalid.getBrakingDistanceFor(100) < passenger.getBrakingDistanceFor(100));
		}
		catch(Exception e) {
			fail("Exception: " + "e");
		}
	}
	
	@Test
	void brakesTest() { // valid data
		try {
			BrakingDistanceEstimator warm = new BrakingDistanceEstimator(BrakingConditions.WEATHER_DAMP,BrakingConditions.LOADING_FULL,BrakingConditions.BRAKES_WARM);
			BrakingDistanceEstimator cold = new BrakingDistanceEstimator(BrakingConditions.WEATHER_SNOW,BrakingConditions.LOADING_FULL,BrakingConditions.BRAKES_COLD);
			
			
			assertTrue(warm.getBrakingDistanceFor(100) < cold.getBrakingDistanceFor(100));
		}
		catch(Exception e) {
			fail("Exception: " + "e");
		}
	}

	@Test
	void invalidBrakesTest() { // valid data
		try {
			BrakingDistanceEstimator warm = new BrakingDistanceEstimator(BrakingConditions.WEATHER_DAMP,BrakingConditions.LOADING_FULL,BrakingConditions.BRAKES_WARM);
			BrakingDistanceEstimator invalid = new BrakingDistanceEstimator(BrakingConditions.WEATHER_DAMP,BrakingConditions.LOADING_FULL,5);
			
			
			assertTrue(invalid.getBrakingDistanceFor(100) < warm.getBrakingDistanceFor(100));
		}
		catch(Exception e) {
			fail("Exception: " + "e");
		}
	}
}
