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
	
	public boolean changePin(int currentPin, int newPin, int confirmPin) {
		if(currentPin != pin) {
			System.out.println("Incorrect current PIN");
			return false;
		}
		
		if(newPin != confirmPin) {
			System.out.println("New PINs does not match.");
			return false;
		}
		
		if(newPin <1000 || newPin > 9999) {
			System.out.println("PIN must contain only 4 digits!");
			return false;
		}
		
		pin = newPin;
		
		System.out.println("PIN changed Successfully.");
		return true;
	}
	
	public void checkBalance() {
		System.out.println("Currrent balance Rs."+balance);;
	}

	
	
	
	

}
