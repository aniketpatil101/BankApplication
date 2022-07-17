package com.htc.BankApp_pojo;

import java.util.Scanner;

public class BankApp6 {

	public static void main(String[] args) {
		System.out.println("Bank Admin Menu");
		System.out.println("Please Enter a Menu Option");
		System.out.println("(1): Add Customer to Bank");
		System.out.println("(2): Change Customer Name");
		System.out.println("(3): Check Account Balence");
		System.out.println("(4): Modify Account Balence");
		System.out.println("(5): Summary of All Accounts");
		System.out.println("(-1): Quit");
		
		Scanner input = new Scanner(System.in);
		int userInput = input.nextInt();
		int size = 0;
		double[] accountBalences = new double[250];
		String[] accountNames = new String[250];
		if(userInput == 1){
			System.out.println("Bank Add Customer Menu");
			System.out.println("Please Enter an account balence");
			double balence = input.nextDouble();
			accountBalences[size] = balence;
			System.out.println("Please enter an account holder name: ");
			input.nextLine();
			String name = input.nextLine();
			accountNames[size] = name;
			System.out.println("Customer's ID is :" + size);
			size = size + 1;
		}
		else if(userInput == 2){
			System.out.println("Bank Change Name Menu");
			System.out.println("Please Enter a customer ID to change their name");
			int index = input.nextInt();
			System.out.println("What is the customer's new name?");
			input.nextLine();
			accountNames[index] = input.nextLine();
		}
		else if(userInput == 3){
			System.out.println("Bank Check Balence Menu");
			System.out.println("Please Enter a customer ID to check their balence");
			int index = input.nextInt();
			double balence = accountBalences[index];
			System.out.println("This customer has $" + balence + " in their account");
		}
		else if(userInput == 4){
			System.out.println("Bank Modify Balence Menu");
			System.out.println("Please Enter a customer ID to check their balence");
			int index = input.nextInt();
			System.out.println("What is the customer's new account balence");
			accountBalences[index] = input.nextDouble();
		}
		else if(userInput == 5) {
			
		}
		else if(userInput == -1) {
			
		}
		else {
			
		}
	}

}

