package day10_Encapsulation;

public class NetBanking {
	private int currentBalance = 50000;
	private int pin = 1234;

	public void setBalance(int deposit, int pin) {
		if (this.pin == pin) {
			currentBalance += deposit;
			System.out.println("Balance Updated");
			System.out.println(currentBalance);
		} else {
			System.out.println("Invalid Pin");
		}
	}

	public void getBalance(int pin) {
		if (this.pin == pin) {
			System.out.println(currentBalance);
		} else {
			System.out.println("Invalid Pin");
		}
	}
	
	public void withdraw(int withdraw, int pin) {
		if (this.pin == pin) {
			if(currentBalance>=withdraw) {
				currentBalance-=withdraw;
				System.out.println(currentBalance);				
			}
			else {
				System.out.println("Insufficient Balance");
			}
		} else {
			System.out.println("Invalid Pin");
		}
	}
	
}
