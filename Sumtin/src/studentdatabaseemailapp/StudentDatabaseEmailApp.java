package studentdatabaseemailapp;

import java.util.Scanner;

public class StudentDatabaseEmailApp {

	public static void main(String[] args) {
		/*
		Student st1 = new Student();
		st1.setCourses();
		st1.setPayment();
		System.out.println(st1.getStatus());
		*/
		
		System.out.println("Please enter the number of students to enroll: ");
		Scanner in = new Scanner(System.in);
		int nr = in.nextInt();
		Student[] students = new Student[nr];
		
		for (int i = 0; i<nr; i++) {
			students[i] = new Student();
			students[i].setCourses();
			students[i].setPayment();
			System.out.println(students[i].getStatus());
		}
		
		Student st1 = new Student();
		st1.setCourses();
		st1.setPayment();
		System.out.println(st1.getStatus());
		
		
		
	}

}
