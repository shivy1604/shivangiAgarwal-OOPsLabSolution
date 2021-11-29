package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.bean.Employee;
import com.greatlearning.service.CredentialService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the first name");
		String firstName=sc.next();
		System.out.println("Enter the last name");
		String lastName=sc.next();
		System.out.println("Please enter the department from the following options:");
		System.out.println("1 : Technical");
		System.out.println("2 : Admin");
		System.out.println("3 : Human Resource");
		System.out.println("4 : Legal");
		int ch=sc.nextInt();
		
		Employee emp;
		switch(ch) {
		case 1 : emp=new Employee(firstName,lastName, "tech");
				break;
		case 2 : emp=new Employee(firstName,lastName, "admin");
				break;
		case 3 : emp=new Employee(firstName,lastName, "hr");
				break;
		case 4 : emp=new Employee(firstName,lastName, "legal");
				break;
		default:System.out.println("Invalid option");
				return;
		}
		
		CredentialService cs=new CredentialService();
		String emailId=cs.generateEmailID(emp);
		//System.out.println("Your email id is: " + emailId);
		String password=cs.generatePassword();
		//System.out.println("Your password is: " + password);
		cs.showCredentials(emp, emailId, password);
		
	}

}
