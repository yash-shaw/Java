package day11_Aggregation;

public class Bank {
	String bankName;
	Customer c;
	
	public Bank(String bankName, Customer c) {
		this.bankName=bankName;
		this.c=c;
	}
	
	public void display() {
		System.out.println(this.bankName+" "+this.c.customerName);
	}
}
