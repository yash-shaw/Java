package day11_Aggregation;

public class PhoneSimDriver {
	public static void main(String[] args) {
		Sim s=new Sim(1234567890);
		Phone p=new Phone("Realme",s);
		p.display();
		
		p=null;
		System.out.println(s.phoneNo);
	}
}
