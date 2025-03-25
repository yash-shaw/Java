package day11_Aggregation;

public class BankCustomerDriver {
	public static void main(String[] args) {
		Customer c=new Customer("Yash");
		Bank b=new Bank("SBI",c);
		b.display();
		b=null;
		System.out.println(c.customerName);
		
	}
}
