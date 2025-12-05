package model;
import java.util.Date;


public class LoanAccount extends Account {

    double loanAmount;     // Remaining loan amount
    double interestRate;   // Annual interest rate percentage
    boolean loanClosed = false; // Loan completed or rejected
    int cibilScore;        // Credit score

    
    public LoanAccount(String accountNumber, String holderName, double balance, String status,
                double loanAmount, double interestRate, int cibilScore) {

        // Always set status as pending first
        super(accountNumber, holderName, balance, "pending");

        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.cibilScore = cibilScore;

        // CIBIL < 650 → loan rejected
        if (cibilScore < 650) {
            this.status = "Rejected";
            this.loanClosed = true;   // No loan will be processed
        } 
        else {
            // Loan approved
            this.status = "Active";
            
            // Loan amount is treated as negative balance
            this.balance = -loanAmount;   
        }
    }

    public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public boolean isLoanClosed() {
		return loanClosed;
	}

	public void setLoanClosed(boolean loanClosed) {
		this.loanClosed = loanClosed;
	}

	public int getCibilScore() {
		return cibilScore;
	}

	public void setCibilScore(int cibilScore) {
		this.cibilScore = cibilScore;
	}

	// ---------------------------------------
    // Loan Payment (Deposit)
    // ---------------------------------------
    @Override
    public boolean deposit(double amount) {

        if (frozen || loanClosed) return false;

        double prev = balance;

        // Reduce loan amount
        loanAmount -= amount;

        // Balance is negative until loan is cleared
        balance = -loanAmount;

        // Log transaction
        addTransaction("TX208", "LoanPayment", amount, prev, balance, new Date());

        // If loan fully paid
        if (loanAmount <= 0) {
            loanClosed = true;
            loanAmount = 0;
            balance = 0;   // Account becomes zero after full payment
        }

        return true;
    }

    // Withdraw is not allowed for loan accounts
    @Override
    public boolean withdraw(double amount) {
        return false;
    }

    // Interest calculation on remaining loan
    @Override
    public double calculateInterest() {
        return loanAmount * (interestRate / 100);
    }
}
