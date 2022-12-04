package com.greatlearning.service;


import com.greatlearning.interfaces.ICredentials;
import com.greatlearning.model.Employee;
import java.util.Random;

public class CredentialServices implements ICredentials {
	
	@Override
	public String generateEmail(String firstName, String lastName, String department) {
		
		return (firstName  + lastName + "@" + department + ".abc.com");
	}
	
	@Override
	public String generatePassword() {
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_?><.";
		
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		
		Random random = new Random();
		
		String password = "";
		char temp;
		for(int i=0;i<8;i++) {
			password += String.valueOf(values.charAt(random.nextInt(values.length())));
		}
		return password;
	}
	
	@Override
	public void displayCredentials(Employee employee) {
		
		System.out.println("Dear "+ employee.getFirstName() + ", your credentials are as follows");
		System.out.println("Email ----> " + employee.getEmail());
		System.out.println("Password ----> " + employee.getPassword());
	}

}
