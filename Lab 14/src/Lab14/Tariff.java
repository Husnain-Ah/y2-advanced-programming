package Lab14;

public class Tariff {
		
	String supplierName; String tariffName; int fixLength; double electricityStandingCharge;
	double electricityPricePerKWH; double gasStandingCharge; double gasPricePerKWH;
	
	public String getSupplierName() {
		return supplierName;
	}
	
	public String getTariffName() {
		return tariffName;
	}
	
	public int getFixLength() {
		return fixLength;
	}
	
	public double getElectricityStandingCharge() {
		return electricityStandingCharge;
	}
	
	public double getElectricityPricePerKWH() {
		return electricityPricePerKWH;
	}
	
	public double getGasStandingCharge() {
		return gasStandingCharge;
	}
	
	public double getGasPricePerKWH() {
		return gasPricePerKWH;
	}
	
	public void setSupplierName(String name) {
		this.supplierName = name;
	}
	
	public void setTariffName(String name) {
		this.tariffName = name;
	}
	
	public void setFixLength(int num) {
		this.fixLength = num;
	}
	
	public void setElectricityStandingCharge(double num) {
		this.electricityStandingCharge = num;
	}
	
	public void setElectricityPricePerKWH(double num) {
		this.electricityPricePerKWH = num;
	}
	
	public void setGasStandingCharge(double num) {
		this.gasStandingCharge = num;
	}
	
	public void setGasPricePerKWH(double num) {
		this.gasPricePerKWH = num;
	}

	public Tariff(String supplierName, String tariffName, int fixLength, double electricityStandingCharge,
			double electricityPricePerKWH, double gasStandingCharge, double gasPricePerKWH) {
		
		this.supplierName = supplierName;
		this.tariffName = tariffName;
		this.fixLength = fixLength;
		this.electricityStandingCharge = electricityStandingCharge;
		this.electricityPricePerKWH = electricityPricePerKWH;
		this.gasStandingCharge = gasStandingCharge;
		this.gasPricePerKWH = gasPricePerKWH;
	}

	
}
