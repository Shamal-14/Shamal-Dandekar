import java.util.*;

class BankAcc{
	int accNum;
	String accHolderName;
	double currentBalance;
	static double interestRate;

	static
	{
		interestRate=12.3;
	}

	BankAcc(){
		this.accNum=1234;
		this.accHolderName="swami";
		this.currentBalance=10000.1000;
		//this.interestRate=3.3;
	}

	BankAcc(int no,String n,double current){
		this.accNum=no;
		this.accHolderName=n;
		this.currentBalance=current;
		//this.interestRate=intrest;
	}
	void setAccNum(int n){
		this.accNum=n;
	}
	void setAccHolderName(String n){
		this.accHolderName=n;
	}
	void setCurrentBalance(double n){
		this.currentBalance=n;
	}
	static void setInterestRate(double n){
		interestRate=n;
	}

	int getAccNum(){
		return this.accNum;
	}
	String getAccHolderName(){
		return this.accHolderName;
	}
	double getCurrentBalance(){
		return this.currentBalance;
	}
	double  getInterestRate(){
		return this.interestRate;
	}

	void display(){
		
		System.out.println("\n Account number:"+this.accNum);
		System.out.println("Name:"+this.accHolderName);
		System.out.println("Current Balance:"+this.currentBalance);
		System.out.println("Interest Rate:"+this.interestRate);
	}
}
//class bankAcc ends hear

class Test1{

	public static void main(String []args){

		BankAcc b1=new BankAcc(1234,"Pratiksha",2000);
		b1.display();
		BankAcc b2=new BankAcc(1222,"amit",5000);
		b2.display();
		BankAcc b3=new BankAcc(7,"Gabbar",1);
		b3.display();
		BankAcc.setInterestRate(7.8);
		b1.display();
		b2.display();
		b3.display();

		b1.setInterestRate(7.7);
		b1.display();
		b2.display();
		b3.display();


	}

	}