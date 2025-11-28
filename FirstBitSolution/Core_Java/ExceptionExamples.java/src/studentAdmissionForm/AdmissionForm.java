package studentAdmissionForm;

public class AdmissionForm {
	String studentName;
	int age;
	double percentage;
	double courseFees;
	double feesPaid;
	
	AdmissionForm(String studentName,int age,double percentage,double courseFees,double feesPaid){
		this.studentName=studentName;
		this.age=age;
		this.percentage=percentage;
		this.courseFees=courseFees;
		this.feesPaid=feesPaid;
		
		
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public double getCourseFees() {
		return courseFees;
	}

	public void setCourseFees(double courseFees) {
		this.courseFees = courseFees;
	}

	public double getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(double feesPaid) {
		this.feesPaid = feesPaid;
	}
	
	void validateForm() throws EmptyNameException, UnderAgeException, InvalidPercentageException, NotFitForAdmissionException, FeesNotPaidException, InsufficientFeesException {
		if (studentName=="  "|| studentName== null) {
			throw new EmptyNameException();
			
		}
		if (age<17) {
			throw new UnderAgeException();
		}
		if (percentage<0 && percentage > 100) {
			throw new InvalidPercentageException();
		}
		if (percentage<35) {
			throw new NotFitForAdmissionException();
		}
		if (feesPaid==0) {
			throw new FeesNotPaidException();
		}
		if (feesPaid<(0.30*courseFees)) {
			throw new InsufficientFeesException();
			
		}
	}
	

}
