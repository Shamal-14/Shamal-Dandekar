package movieTicketBooking;
import java.util.Scanner;

public class TestMovieBooking {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        MovieBooking mb = new MovieBooking();

	        while (MovieBooking.getRemainingTickets() > 0) {

	            
	            System.out.println("1. 3 Idiots");
	            System.out.println("2. Dangal");
	            System.out.println("3. Bahubali 2");
	            System.out.println("4. Kabir Singh");
	            System.out.println("5. Chhichhore");
	            System.out.println("6. ZNMD");
	            System.out.println("7. Tanhaji");
	            System.out.println("8. Uri");
	            System.out.println("9. War");
	            System.out.println("10. Bajrangi Bhaijaan");

	            System.out.println("Remaining Tickets: " + MovieBooking.getRemainingTickets());
	            System.out.print("Movie No: ");
	            int movieNo = sc.nextInt();

	            System.out.print("Tickets: ");
	            int count = sc.nextInt();

	            try {
	                mb.bookTickets(movieNo, count);
	            } catch (Exception e) {
	                System.out.println("Error: " + e.getMessage());
	            }
	        }

	        System.out.println("\nSorry! Tickets are sold out.");
	        sc.close();
	    }
	}



