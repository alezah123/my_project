package studentdatabaseemailapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String studentID;
	private int yearLevel;
	private String enrolledCourses = "";
	private int balance = 0;
	private int payment = 0;
		private static int tuitionFee = 600;
	private static int ID = 1000;
	
	//Constructor: ask for name, year level and create a unique id with the first digit being the year level 
	public Student() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student year level: ");
		this.yearLevel = in.nextInt();
		
		setUniqueID();
					
	}
	
	//Create the unique id
	private void setUniqueID() {
		ID++;
		this.studentID = String.valueOf(yearLevel) + String.valueOf(ID);
	}
	
	//Enroll courses
	public void setCourses() {
	
		do {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter courses to attend (press 'Q' to quit): ");
			String cond = in.nextLine();
			if (!cond.equals("Q")) {
				this.enrolledCourses = this.enrolledCourses + "\n  " + cond;
				this.balance = this.balance + tuitionFee;
			}else { break; }
			
		}while (0<1);
		System.out.println("Enrolled courses: " + this.enrolledCourses);
		
	}
	
	//Pay tuition
	public void setPayment() {
		viewBalance();
		System.out.println("Enter your payment of: ");
		Scanner in = new Scanner(System.in);
		this.payment = in.nextInt();
		System.out.println("Thank for your payment of: " + payment);
		balance = balance - payment;
		viewBalance();
	}
	
	//Show status info (name, ID, courses and balance)
	public String getStatus() {
		return "\nName: " + firstName + " " + lastName + "\nID: " + studentID + "\nCourses:" + 
				enrolledCourses + "\nBalance: " + balance + "$";	
	}
	
	// View balance
	public void viewBalance() { 
		System.out.println("Your balance is: " + balance); }
	
}
