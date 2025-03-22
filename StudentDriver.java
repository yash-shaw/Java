package day10_Encapsulation;

import java.util.Scanner;

public class StudentDriver {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Student s=new Student();
		
		// To fetch all the data after authentication
		s.fetchData("yashshaw009@gmail.com","Yash@1234");
		
		//To change the password
		System.out.println("Enter email id");
		String email = scan.nextLine();
		System.out.println("Enter old password");
		String oldPassword = scan.nextLine();
		s.changePassword(email,oldPassword);
		
		// To view the password
		System.out.println("Enter your password");
		String password = scan.nextLine();
		s.getPassword(password);
		
		scan.close();
		
	}
}
