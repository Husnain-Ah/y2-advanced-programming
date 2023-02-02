import java.time.LocalDate;


public class Booking {

		private LocalDate startDate;
		private int numberOfNights ;
		private double costPerNight;
		
		LocalDate getStartDate(){
			 return startDate;
		 }
		
		void setStartDate(LocalDate date) {
			this.startDate = LocalDate.now();
		}
		
		int getNumberOfNights() {
			return numberOfNights;
		}
		
		void setNumberOfNights(int nights) {
			this.numberOfNights = nights;
		}
		
		double getCostPerNight() {
			return costPerNight;
		}

		void  setCostPerNight(double cost) {
			this.costPerNight = cost;
		}
		
		double getTotalCost() {
			return costPerNight * numberOfNights;
		}
}
