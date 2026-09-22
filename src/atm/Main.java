package atm;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ATM atm = new ATM(2203, 985);
		
		System.out.println("Enter your PIN :");
		int enteredPin = scan.nextInt();
		if(atm.verifyPin(enteredPin)) {
			System.out.println("Login Successfully");
			
			int choice = 0;
			
			while(choice != 5) {
				System.out.println();
				System.out.println("=================================");
				System.out.println("             ATM Menu            ");
				System.out.println("=================================");
				System.out.println();
				System.out.println("1. Check Balance ");
				System.out.println("2. Deposit Money ");
				System.out.println("3. Withdraw Money");
				System.out.println("4. Change PIN ");
				System.out.println("5. Exit");
				
				System.out.println("Enter your Choice : ");
				choice = scan.nextInt();
				
				switch(choice) {
				case 1: 
					atm.checkBalance();
					break;
				
				case 2:
					System.out.println("Enter the amount to deposit: ");
					double depositAmount = scan.nextDouble();
					atm.deposit(depositAmount);
					break;
					
				case 3:
					System.out.println("Enter thr money to withdraw: ");
					double withdrawalAmount = scan.nextDouble();
					atm.withdraw(withdrawalAmount);
					break;
					
				case 4:
					System.out.println("Enter Current PIN : ");
					int currentPin = scan.nextInt();
					
					System.out.println("Enter New PIN : ");
					int newPin = scan.nextInt();
					
					System.out.println("Confirm New PIN : ");
					int confirmPin = scan.nextInt();
					
					atm.changePin(currentPin, newPin, confirmPin);
					break;
					
				case 5:
					System.out.println("Thank you using our ATM. ");
					break;
			}
			}
		}else {
			System.out.println("Incorrect PIN");
		}
		
		scan.close();
	}
}
