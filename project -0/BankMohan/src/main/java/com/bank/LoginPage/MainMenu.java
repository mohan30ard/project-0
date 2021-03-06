package com.bank.LoginPage;

import java.util.Hashtable;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.bank.customer.CustomerDetails;

public class MainMenu extends CustomerDetails {
	private static Logger log = Logger.getLogger(MainMenu.class);
	static CustomerDetails r1 = new CustomerDetails();

	public static void mainMenu() {
		int menuChoice;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Welcome to Mohan Bank \n" + "press 1 to create Account \n"
					+ "press 2 to go to login portal\n" + "press 3 to Exit the Application\n");
			log.info("entered MainMenu");
			menuChoice = Integer.parseInt(sc.nextLine());
			switch (menuChoice) {
			case 1:
				registration();
				break;
			case 2:
				loginMenu();
				break;
			case 3:
				System.out.println("Thank you for using our Banking Services. " + "Goodbye....!");
				System.exit(0);
			}
		}
	}

	static Hashtable<Integer, String> map = new Hashtable<>();

	public static void registration() {
		try (Scanner scanner = new Scanner(System.in)) {
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
			map.put(r1.getUserId(), password1);
			System.out.print("Enter your Mobile Number => ");
			long mobileNumber = Long.parseLong(scanner.nextLine());
			r1.setMobileNumber(mobileNumber);
			System.out.println("Successfully registered to Mohan Bank");
			log.info("new account created " + r1.getUserId());
			mainMenu();
		}
	}

	public static void loginMenu() {
		int menuChoice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome Login Portal\n" + "press 1 for Customer Login\n" + "press 2 for Employee Login\n"
				+ "press 3 for MainMenu\n" + "press 4 for Exit");
		menuChoice = Integer.parseInt(sc.nextLine());
		switch (menuChoice) {
		case 1:
			System.out.println("Enter UserId => ");
			int userId = Integer.parseInt(sc.nextLine());
			if (map.containsKey(userId)) {
				System.out.println("Enter Password => ");
				String password = sc.nextLine();
				if (password.equals(map.get(userId))) {
					System.out.println("Hello " + userId);
					 log.info("customer logged into account"+userId);
					System.out.println("Welcome to Mohan Bank");
					System.out.println("You have successfully logged in");
					System.out.println("Select the operation you want perform");
					System.out.println("press 1 to Exit the Application\n" 
										+ "press 2 to return to MainMenu"
										+ "press 3 to"
										+ "press 4 to "
										+ "press 5 to view statements"
										+ "press 6 to Logout");
					int ch1 = Integer.parseInt(sc.nextLine());
					switch (ch1) {
					case 1:
						System.out.println("Thank you for using our Banking Services. " + "Goodbye....!");
						log.info("Successfully logged out of app");
						System.exit(0);
					case 2:
						mainMenu();
						break;
					}
				}
				else {
					log.warn("invalid userid or password entered");
					loginMenu();
					// System.out.println("Invalid Username or password ..");
				}
			} else {
				log.warn("invalid userid or password entered");
				loginMenu();
				// System.out.println("Invalid Username or password ..");
			}
			break;
		case 2:
			System.out.println("entered employee login portal");
			break;
		case 3:
			mainMenu();
			break;
		case 4:
			System.out.println("Thank you for using our Banking Services. " + "Goodbye....!");
			log.info("Successfully logged out of app");
			System.exit(0);
		default:
			System.out.println("entered option is invalid");
			mainMenu();
			break;
		}
		sc.close();
	}

	public static void main(String[] args) {
		map.put(28368987, "password");

		mainMenu();

	}
}
