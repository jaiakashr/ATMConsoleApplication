package atm;

public class ATM {
	
	private int pin;
	private double balance;
	
	public ATM(int pin, double balance) {
		this.pin = pin;
		this.balance = balance;
	}
	
	public void checkBalance() {
		System.out.println("Currrent balance Rs."+balance);;
	}
	

}
