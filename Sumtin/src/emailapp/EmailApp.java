package emailapp;

import java.util.Scanner;

public class EmailApp {
	
	private String firstName;
	private String lastName;
	private String department = "";
	private String password;
	private int passLength = 8;
	private int mailboxCapacity = 600;
	private String altEmail = "";
	private String companySuffix = "bgs.com";
	
	//Constructor: generate email
	
	public EmailApp(String firstName, String lastName) {
		
		System.out.println("Follow the steps below\n");
		this.firstName = firstName;
		this.lastName = lastName;
		setDepartment();
		setRandPassword();
		
	}
	
	//Set department
	private void setDepartment() {
		
		System.out.println("Select department:\n1 - Production\n2 - Development\n3 - Sales\n0 - Other");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		if (choice == 1) { this.department = "Production"; }
		else if (choice == 2) { this.department = "Development"; }
		else if (choice == 3) { this.department = "Sales"; }
		else if (department == "") { this.department = "Other"; }
		
	}
	
	//Set random password
	private void setRandPassword() {
		String passwordSet = "ABCDEFGHIJKLOMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^";
		char[] password = new char[passLength];
		
		for (int i = 0; i<passLength; i++) {
			int rand = (int)(Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		this.password = new String(password);
	}
	
	//Set password
	public void setPassword(String password) {
		this.password = password;
	}
	
	//Set mailbox capacity
	public void setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}
	
	//Set alternate email
	public void setAltEmail(String altEmail) {
		this.altEmail = altEmail;
	}
	
	//Get name
	public String getName() {
		return firstName + " " + lastName;
	}
	
	//Get email
	public String getEmail() {
		return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
	}
	
	//Get mailbox capacity
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	//Get password
	public String getPassword() {
		return password;
	}
}
