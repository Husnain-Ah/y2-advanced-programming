import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Month;

public class BookingManager {

	private ArrayList<Booking> bookings = new ArrayList<Booking>();
	
	void addBooking(Booking booking) {
		bookings.add(booking);
	}
	
	int getNumberOfBookings() {
		return bookings.size();
	}
	
	double  getTotalBookingValue() {
		
		int sum = 0;
		
		for (int i = 0; i < bookings.size(); i++) {
			sum += bookings.get(i).getTotalCost();
		}
		
		return sum;
	}
	
	void clearBookings(){
		bookings.clear();
	}
	
	 ArrayList<Booking> getAllBookings() {
		return bookings;
	}
	 
	 ArrayList<Booking> getAllBookingsInMonth(String month){
		 LocalDate now = LocalDate.now(); 
		 
		 ArrayList<Booking> monthlyBookings =  new ArrayList<Booking>();
		 
		 for (int i = 0; i < bookings.size(); i++) {
			if(bookings.get(i).getStartDate().getMonth() == now.getMonth()) {
				 monthlyBookings.add(bookings.get(i));
			}
		}
		 return monthlyBookings;
		
	 }
	
}
