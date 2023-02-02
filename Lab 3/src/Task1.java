import java.time.LocalDate;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Booking booking1 = new Booking();
		Booking booking2 = new Booking();

		LocalDate currentDate = LocalDate.now();
		LocalDate secondDate = LocalDate.of(2022, 10, 1);
		
		
		booking1.setStartDate(currentDate);
		booking2.setStartDate(secondDate);
		
		booking1.setCostPerNight(10);
		booking2.setCostPerNight(25);
		
		booking1.setNumberOfNights(5);
		booking2.setNumberOfNights(2);
		
		System.out.println(booking1.getTotalCost());
		System.out.println(booking2.getTotalCost());
		
		BookingManager bookingManager = new BookingManager();
		
		bookingManager.addBooking(booking1);
		bookingManager.addBooking(booking2);
		
		System.out.println(bookingManager.getTotalBookingValue());
		
		System.out.println(bookingManager.getAllBookingsInMonth("October"));
		
	}

}
