package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.bean.Employee;

public class CredentialService {
		
	
	public String generateEmailID(Employee emp) {
		return emp.getFirstName().toLowerCase()+""+emp.getLastName().toLowerCase()+"@"+emp.getDepartmentName()+".greatlearning"+".com";
	
	}
	
	public String generatePassword(){
		String passwordCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%&";
		char password[]=new char[8];
		Random ran=new Random();
		for(int i=0;i<8;i++) {
			int n = ran.nextInt(passwordCharacters.length());
			//System.out.println(n+"="+(char)n);
			password[i]=passwordCharacters.charAt(n);
		}
		return String.valueOf(password);
	}
	public void showCredentials(Employee emp, String emailId, String password) {
		System.out.println("Dear "+emp.getFirstName()+", your generated credentials are as follows:");
		System.out.println("Your email is: "+emailId);
		System.out.println("Your password is: "+password);
		
	}
}
