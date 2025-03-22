package day10_Encapsulation;

import java.util.Scanner;

public class Student {

	public static Scanner scan = new Scanner(System.in);

	private String email = "yashshaw009@gmail.com";
	private String password = "Yash@1234";
	private String name = "Yash";
	private int age = 23;
	private String gender = "male";
	private String branch = "ECE";

	public String getEmail() {
		return email;
	}

	public void getPassword(String password) {
		if(this.password.equals(password)) {
			System.out.println(password);			
		}
		else {
			System.out.println("Invalid password");
		}
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void changePassword(String email,String password) {
		if (this.email.equals(email) && this.password.equals(password)) {
			System.out.println("Enter new password");
			String newPassword = scan.nextLine();
			System.out.println("Confirm new password");
			String confirmPassword = scan.nextLine();
			if (newPassword.equals(confirmPassword)) {
				this.password = confirmPassword;
				System.out.println("Password updated successfully");
			} else {
				System.out.println("Passwords do not match");
			}
		} else {
			System.out.println("Invalid Password");

		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void fetchData(String email, String password) {
		if (this.email == email && this.password == password) {
			System.out.println("Name: " + getName());
			System.out.println("Age: " + getAge());
			System.out.println("Gender: " + getGender());
			System.out.println("Branch: " + getBranch());
		} else {
			System.out.println("Invalid credentials");
		}
	}

}
