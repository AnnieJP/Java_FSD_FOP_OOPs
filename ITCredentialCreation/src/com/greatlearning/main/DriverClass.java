package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialServices;
import com.greatlearning.interfaces.ICredentials;

public class DriverClass {
	
	public static void main(String args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to IT Credential Creaion\n");
		System.out.println("Please enter first name: ");
		String firstName = sc.nextLine();
		System.out.println("Please enter last name: ");
		String lastName = sc.nextLine();
		
		Employee employee = new Employee(firstName, lastName);
		
		
		String generatedEmail = null;
		String generatedPassword = null;
		
		ICredentials cs = new CredentialServices();
		
		
		int choice =0;
	
		do {
			
			
			System.out.println("Enter choice for name of department. \n1. Technical \n2. Admin \n3. Human Resources \n4. Legal \n0.Logout");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:{
				generatedEmail = cs.generateEmail(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "tech");
				employee.setEmail(generatedEmail);
				generatedPassword = cs.generatePassword();
				employee.setPassword(generatedPassword);
				
			
				cs.displayCredentials(employee);
				System.out.println("\n\n");
				break;
			}
			
			case 2:{
				generatedEmail = cs.generateEmail(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "adm");
				employee.setEmail(generatedEmail);
				generatedPassword = cs.generatePassword();
				employee.setPassword(generatedPassword);
			
				cs.displayCredentials(employee);
				System.out.println("\n\n");
				break;
				
			}
			
			case 3:{
				generatedEmail = cs.generateEmail(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "hr");
				employee.setEmail(generatedEmail);
				generatedPassword = cs.generatePassword();
				employee.setPassword(generatedPassword);
				
				cs.displayCredentials(employee);
				System.out.println("\n\n");
				break;
			}
			
			case 4:{
				generatedEmail = cs.generateEmail(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "legal");
				employee.setEmail(generatedEmail);
				generatedPassword = cs.generatePassword();
				employee.setPassword(generatedPassword);
				
				cs.displayCredentials(employee);
				System.out.println("\n\n");
				break;
			}
			
			case 0:{
				System.out.println("\nLogged Out Successfully!");
				break;
			}
			
			default:{
				System.out.println("\nPlease enter a valid choice.");
				System.out.println("\n\n");
			}
			}
			
			
			
		}while (choice != 0);
				
	}

}
