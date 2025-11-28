package studentAdmissionForm;

public class Test {
    public static void main(String[] args) {

        try {
            AdmissionForm af = new AdmissionForm("shamal", 18, 70.00, 23000, 23000);
            af.validateForm();
            System.out.println("Admission Successful!");
        }
        catch (EmptyNameException e) {
            System.out.println("Error: Name cannot be empty!");
        }
        catch (UnderAgeException e) {
            System.out.println("Error: Age is below the required limit!");
        }
        catch (InvalidPercentageException e) {
            System.out.println("Error: Percentage value is invalid!");
        }
        catch (NotFitForAdmissionException e) {
            System.out.println("Error: Percentage too low for admission!");
        }
        catch (FeesNotPaidException e) {
            System.out.println("Error: No fees have been paid!");
        }
        catch (InsufficientFeesException e) {
            System.out.println("Error: Paid fees are less than 30% of the course fees!");
        }

    }
}
