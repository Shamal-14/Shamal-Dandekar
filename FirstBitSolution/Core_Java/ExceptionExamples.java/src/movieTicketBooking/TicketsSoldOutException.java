package movieTicketBooking;

public class TicketsSoldOutException extends Exception {
	public TicketsSoldOutException(String message) {
        super(message);
    }

}
