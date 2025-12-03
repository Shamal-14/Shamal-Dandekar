package movieTicketBooking;

public class MovieBooking {
	
	    // Static variables (common for all bookings)
	    private static int ticketPrice = 200;
	    private static int maxAvailableTickets = 50;

	    // Default Constructor
	    public MovieBooking() {
	        // Nothing special required here
	    }

	    // Parameterized Constructor
	    public MovieBooking(int price, int availableTickets) {
	        ticketPrice = price;
	        maxAvailableTickets = availableTickets;
	    }

	    // Getters
	    public static int getTicketPrice() {
	        return ticketPrice;
	    }

	    public static int getRemainingTickets() {
	        return maxAvailableTickets;
	    }

	    // Setters
	    public static void setTicketPrice(int price) {
	        ticketPrice = price;
	    }

	    public static void setMaxAvailableTickets(int tickets) {
	        maxAvailableTickets = tickets;
	    }

	    // toString() (optional)
	    @Override
	    public String toString() {
	        return "Ticket Price: ₹" + ticketPrice +
	               " | Remaining Tickets: " + maxAvailableTickets;
	    }

	    // Method to get movie name using switch-case
	    private String getMovieName(int movieNumber) throws InvalidMovieSelectionException {
	        switch (movieNumber) {
	            case 1: return "3 Idiots";
	            case 2: return "Dangal";
	            case 3: return "Bahubali 2: The Conclusion";
	            case 4: return "Kabir Singh";
	            case 5: return "Chhichhore";
	            case 6: return "Zindagi Na Milegi Dobara";
	            case 7: return "Tanhaji";
	            case 8: return "Uri: The Surgical Strike";
	            case 9: return "War";
	            case 10: return "Bajrangi Bhaijaan";
	            default:
	                throw new InvalidMovieSelectionException("Invalid movie number!");
	        }
	    }

	    // Main booking method
	    public void bookTickets(int movieNumber, int ticketCount)
	            throws InvalidMovieSelectionException,
	                   InvalidTicketNumberException,
	                   TicketsSoldOutException {

	        // Validate ticket count
	        if (ticketCount <= 0) {
	            throw new InvalidTicketNumberException("Ticket count must be greater than 0!");
	        }

	        // Check availability
	        if (ticketCount > maxAvailableTickets) {
	            throw new TicketsSoldOutException("Not enough tickets available!");
	        }

	        // Get movie name from switch-case
	        String movieName = getMovieName(movieNumber);

	        // Deduct tickets
	        maxAvailableTickets -= ticketCount;

	        // Calculate amount
	        int totalAmount = ticketCount * ticketPrice;

	        // Success message
	        System.out.println("\nBooking Successful for \"" + movieName + "\"!");
	        System.out.println("Tickets booked: " + ticketCount);
	        System.out.println("Total amount: ₹" + totalAmount + "\n");
	    }
	}



