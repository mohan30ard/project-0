package com.bank.LoginPage;

import java.util.Hashtable;
import java.util.Scanner;

import com.bank.customer.CustomerDetails;

public class LoginMain extends CustomerDetails {
	

	public static void main(String[] args) {
		LoginMain r1 = new LoginMain();
		Hashtable<Integer,String> map=new Hashtable<>();
		map.put(28368987, "password");
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Welcome to Mohan Bank");
			System.out.println("press 1 to create Account");
			System.out.println("press 2 to go to login portal");
			System.out.println("press 3 to Exit the Application");
			int ch;
			ch = Integer.parseInt(scanner.nextLine());
			switch (ch) {
			case 1:
				System.out.print("Enter your First Name => ");
				String firstName = scanner.nextLine();
				r1.setFirstName(firstName);
				System.out.print("Enter your Last Name => ");
				String lastName = scanner.nextLine();
				r1.setLastName(lastName);
				System.out.print("Enter your Email Id => ");
				String emailId = scanner.nextLine();
				r1.setEmailId(emailId);
				try {
					System.out.print("Enter your 8 digit userId => ");
					int userId = Integer.parseInt(scanner.nextLine());
					r1.setUserId(userId);
					//System.exit(0);
				} catch (Exception ex) {
					System.out.println(ex.getMessage());
					System.out.println("Enter only 8 digit numbers");
				} finally {
					System.out.print("Enter your userId Again => ");
					int userId = Integer.parseInt(scanner.nextLine());
					r1.setUserId(userId);
				}
				System.out.print("Enter your Password => ");
				String password1 = scanner.nextLine();
				r1.setPassword(password1);
				map.put(r1.getUserId(),password1);
				System.out.print("Enter your Mobile Number => ");
				long mobileNumber = Long.parseLong(scanner.nextLine());
				r1.setMobileNumber(mobileNumber);
				System.out.println("Successfully registered to Mohan Bank");
				System.out.println("please reload the page and login with your userid and password");
				// System.exit(0);
				break;
			case 2:
				System.out.println("Enter UserId => ");
				int userId = Integer.parseInt(scanner.nextLine());
				if(map.containsKey(userId)) {
				System.out.println("Enter Password => ");
				String password = scanner.nextLine();
				if(password.equals(map.get(userId)))
				{
					System.out.println("Welcome to Mohan Bank");
					System.out.println("You have successfully logged in");
					System.out.println("Select the operation you want perform");
					System.out.println("press 1 to Exit the Application");

					int ch1 = Integer.parseInt(scanner.nextLine());
					switch (ch1) {
					case 1:
						System.out.println("you have successfully logged out");
						System.exit(0);
					}
				}
				} else {
					System.out.println("Invalid Username or password ..");
				}
				break;
			case 3:
				System.out.println("you have successfully exited the application");
				System.exit(0);
				break;
			default:
				System.out.println("entered option is invalid");

			}
		}

	}

}
