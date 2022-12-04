package com.greatlearning.interfaces;

import com.greatlearning.model.Employee;


public interface ICredentials {
	
	public String generateEmail(String firstName, String lastName, String department);
	
	public String generatePassword();
	
	public void displayCredentials(Employee employee);

}
