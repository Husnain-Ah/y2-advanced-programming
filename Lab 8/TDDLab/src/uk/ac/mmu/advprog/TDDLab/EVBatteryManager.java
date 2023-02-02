package uk.ac.mmu.advprog.TDDLab;

/**
 * Provides estimates of EV range and charging time based on a variety of variables 
 * including current charge level, charger power & efficiency, and distance travelled.
 * 
 * Most of the methods are blank, you will need to complete them to get the class working.
 * 
 * The tests included in EVBatteryManagerTest can help you verify that you have implemented
 * the various method correctly, and help you to find places where you've made mistakes.
 * 
 * @author You, mainly!
 */
public class EVBatteryManager {


	private int _batteryCapacity = 0; //kWh
	
	private double _chargeLevel = 0; //%
	private double _startJourneyChargeLevel = 0; //%	
	private double _journeyMilesTravelled = 0; //miles;
	private double _reservePowerLevel = 0; //%;
	
	private double _targetChargeLevel = 0; //%	
	private double _chargerPower = 0; //kW
	private double _chargingEfficiency = 0; //%
	
	//Constructors
	
	/**
	 * Default Constructor. Creates an EVBatteryManager Instance with default parameters
	 */
	public EVBatteryManager() {
		
	}
	
	/**
	 * Convenience Constructor, Creates an EVBatteryManager Instance with some basic parameters specified
	 * @throws IllegalArgumentException if the chargeLevel or reservePowerLevel is not a valid percentage
	 */
	public EVBatteryManager(int batteryCapacity, double chargeLevel, double reservePowerLevel) {
		if (chargeLevel < 0 || chargeLevel > 100) throw new IllegalArgumentException("chargeLevel is not a valid percentage, please enter a number between 0 and 100.");
		if (reservePowerLevel < 0 || reservePowerLevel > 100) throw new IllegalArgumentException("reservePowerLevel is not a valid percentage, please enter a number between 0 and 100.");
	}
	
	//Getters & Setters
	
	/**
	 * Sets the journey data for remaining distance estimate calculations
	 * @param startJourneyChargeLevel The battery charge level at the start of the journey, as a %
	 * @param journeyMilesTravelled The number of miles travelled on this journey
	 * @throws IllegalArgumentException if the startJourneyChargeLevel is not a valid percentage
	 * @throws IllegalArgumentException if the journeyMilesTravelled is negative
	 */
	public void setJourneyInfo(double startJourneyChargeLevel, double journeyMilesTravelled) {
		this._chargeLevel = startJourneyChargeLevel;
		this._journeyMilesTravelled = journeyMilesTravelled;
		
		if (startJourneyChargeLevel < 0 || startJourneyChargeLevel > 100) throw new IllegalArgumentException("startJourneyChargeLevel is not a valid percentage, please enter a number between 0 and 100.");
		if (journeyMilesTravelled < 0 ) throw new IllegalArgumentException("journeyMilesTravelled is negative, please enter a number above 0.");
	}
	
	/**
	 * Sets the charging data for charging time estimate calculations
	 * @param targetChargeLevel The desired battery charge level after charging, as a %
	 * @param chargerPower The rated power of the charger to be used
	 * @param chargingEfficiency The efficiency of the car-charger combination
	 * @throws IllegalArgumentException if the targetChargeLevel or chargingEfficiency is not a valid percentage
	 * @throws IllegalArgumentException if the chargerPower is negative
	 */
	public void setChargingInfo(double targetChargeLevel, double chargerPower, double chargingEfficiency) {
		this._targetChargeLevel = targetChargeLevel;
		this._chargerPower = chargerPower;
		this._chargingEfficiency = chargingEfficiency;
		
		if (targetChargeLevel < 0 || targetChargeLevel > 100) throw new IllegalArgumentException("targetChargeLevel is not a valid percentage, please enter a number between 0 and 100.");
		if (chargingEfficiency < 0 || chargingEfficiency > 100) throw new IllegalArgumentException("chargingEfficiency is not a valid percentage, please enter a number between 0 and 100.");
		if (chargerPower < 0 ) throw new IllegalArgumentException("chargerPower is negative, please enter a number above 0.");
	}
	
	/**
	 * Returns the maximum capacity of the vehicle's battery
	 * @return the maximum capacity of the vehicle's battery, in kWh
	 */
	public int getBatteryCapacity() {
		return _batteryCapacity;
	}

	/**
	 * Returns the current level of charge in the vehicle's battery
	 * @return the current level of charge in the vehicle's battery, as a percentage
	 */
	public double getChargeLevel() {
		return _chargeLevel;
	}

	/**
	 * Returns the level of charge in the vehicle's battery after its last charge
	 * @return the level of charge in the vehicle's battery after its last charge, as a percentage
	 */
	public double getStartJourneyChargeLevel() {
		return _startJourneyChargeLevel;
	}

	/**
	 * Returns the number of miles travelled since the vehicle was last charged
	 * @return the number of miles travelled since the vehicle was last charged
	 */
	public double getJourneyMilesTravelled() {
		return _journeyMilesTravelled;
	}

	/**
	 * Returns the percentage of the vehicle's battery that is kept in reserve, and not used in range estimation calculations
	 * @return the percentage of the vehicle's battery that is kept in reserve, and not used in range estimation calculations
	 */
	public double getReservePowerLevel() {
		return _reservePowerLevel;
	}

	/**
	 * Returns the desired percentage of battery charge to be reached in a future charging session
	 * @return the desired percentage of battery charge to be reached in a future charging session
	 */
	public double getTargetChargeLevel() {
		return _targetChargeLevel;
	}

	/**
	 * Returns the rated power of the charger to be used in a future charging session
	 * @return the rated power of the charger to be used in a future charging session, in kW
	 */
	public double getChargerPower() {
		return _chargerPower;
	}

	/**
	 * Returns the efficiency of the vehicle's charging when used with the charger in a future charging session
	 * @return the efficiency of the vehicle-charger combo, as a percentage
	 */
	public double getChargingEfficiency() {
		return _chargingEfficiency;
	}
	
	//Estimator methods
	
	/**
	 * Calculates the estimated remaining range for the EV based on the battery usage and distance travelled so far, 
	 * whilst maintaining the required reserve battery level
	 * @return The calculated range estimate, in miles, rounded to the nearest 0.1 mile
	 */
	public double getEstimatedRemainingRange() {
		double travelled = (_journeyMilesTravelled / (_startJourneyChargeLevel - _chargeLevel));
		double remainingBatteryUse = (_chargeLevel - _reservePowerLevel);
		double rangeEstimate = (remainingBatteryUse * travelled);
		
	    double roundOff = Math.round(rangeEstimate*10)/10;
		
		return roundOff;
	}
	
	/**
	 * Calculates the estimated charging time needed for the EV to reach the desired charging level, based on the 
	 * amount of charge needed, and the power & efficiency of the charger
	 * @return The calculated time, in minutes, rounded to the nearest minute.
	 */
	public double getEstimatedChargingTime() {
		double remainingChargeNeeded = (_targetChargeLevel -  _chargeLevel); // gets percentage of charge needed
		double powerNeeded = (remainingChargeNeeded  * _batteryCapacity); // turns percentage into kwh
		double powerNeededFromCharger = (powerNeeded * _chargingEfficiency); // how much power is actually needed from the charger
		double timeTaken = (powerNeededFromCharger / powerNeeded); // calculates time taken
		
		double roundTime = Math.round(timeTaken); // rounds up or down to whole minute
		
		return roundTime;
	}
	
}
