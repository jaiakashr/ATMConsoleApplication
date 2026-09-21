package atm;

public class ATM {
	
	private int pin;
	private double balance;
	
	public ATM(int pin, double balance) {
		this.pin = pin;
		this.balance = balance;
	}
	
	public boolean verifyPin(int enteredPin) {
		return enteredPin == pin;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance = balance + amount;
			System.out.println("Rs."+amount+" deposit Successfully. ");
			System.out.println("Your current balance is "+balance+".");
		}else {
			System.out.println("Invalid deposit amount.");
		}
	}
	
	public void withdraw(double amount) {
		if(amount<=0) {
			System.out.println("Invalid amount ");
		}
		else if(amount<balance) {
			balance = balance - amount;
			System.out.println("Rs."+amount+" withdrawal successfully. ");
			System.out.println("Your current balance is "+balance+".");
		}else {
			System.out.println("Insufficient Balance! Can't able to withdraw. ");
		}
	}
	
	public void checkBalance() {
		System.out.println("Currrent balance Rs."+balance);;
	}

	
	
	
	

}
