package com.bank.main;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.bank.dao.BankDAO;
import com.bank.daoimpl.BankDAOImpl;
import com.bank.exception.BankException;
import com.bank.model.Customer;
import com.bank.service.BankCrudService;
import com.bank.service.BankSearchService;
import com.bank.serviceimpl.BankCrudServiceImpl;
import com.bank.serviceimpl.BankSearchServiceImpl;

public class Bank_Thor_Main {

	private static Logger log = Logger.getLogger(Bank_Thor_Main.class);

	public static void main(String[] args) {
		
		
	
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		do {
			log.info("Welcome to ThorBankingApp V1.0");
			log.info("==================================");
			log.info("\nProduct Menu");
			log.info("1)Create Account");
			log.info("2)Login into your Account");
			log.info("3)Delete Account");
			log.info("4)EXIT");
			log.info("Enter your Choice 1-4");
			try {
				ch = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				log.info(e.getMessage());
			}
			switch (ch) {
			case 1:
				BankCrudService bankCrudService=new BankCrudServiceImpl();
				try {
					Customer customer=new Customer();
					String userId;
					log.info("Enter your First Name => ");
					String firstName = sc.nextLine();
					log.info("Enter your Last Name => ");
					String lastName = sc.nextLine();
					log.info("Enter your Email Id => ");
					String emailId = sc.nextLine();
					log.info("Enter your Password => ");
					String password = sc.nextLine();
					log.info("Enter your Mobile Number => ");
					String mobileNumber = sc.nextLine();
					log.info("Enter your user Id  => ");
					userId = sc.nextLine();
					if(mobileNumber.matches("[0-9]{10}"))
					{
						customer = new Customer(firstName, lastName, emailId, mobileNumber,userId, password);
					}
					else {
						throw new BankException("mobile Number Should contain only 10 digits ");
					}
					customer=bankCrudService.registerAccount(customer);
					if(customer!=null) {
						log.info("Successfully registered to Thor Bank");
						log.info(customer);
					}
				} catch (NumberFormatException  e) {
					log.warn(e.getMessage());
				} catch (BankException e) {
					log.warn(e.getMessage());
				}
				break;
			case 2:
				int menuChoice =0;
				do {
					log.info("Welcome Login Portal\n" + "press 1 for Customer Login\n" + "press 2 for Employee Login\n"
							+ "press 3 for MainMenu\n" + "press 4 to exit Application");
					try {
						menuChoice = Integer.parseInt(sc.nextLine());
					} catch (NumberFormatException e) {
						log.warn(e.getMessage());
					}
					switch (menuChoice) {
				case 1:
					BankSearchService bankSearchService=new BankSearchServiceImpl() ;
					
						log.info("Enter UserId => ");
						String userId = sc.nextLine();
						Customer customer =null;
						try {
							customer = bankSearchService.getPasswordByUserId(userId);
						} catch (BankException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						if (customer.getPassword()!=null) {
							log.info("Enter Password => ");
							String password = sc.nextLine();
							if (customer.getPassword().equals(password)) {
								log.info("Hello " + userId);
								do {
									int ch1 = 0;
									log.info("customer logged into account" + userId);
									log.info("Welcome to Thor Bank");
									log.info("You have successfully logged in");
									log.info("Select the operation you want perform");
									log.info("press 1 to open New Account\n" + "press 2 to Transfer\n"
											+ "press 3 to Withdraw\n" + "press 4 to Deposit\n"
											+ "press 5 to view statements\n" + "press 6 to Logout");
									try {
										ch1 = Integer.parseInt(sc.nextLine());
									} catch (NumberFormatException e) {
										log.info(e.getMessage());
									}
									switch (ch1) {
									case 1:
										log.info("Thank you for using our Banking Services. " + "Goodbye....!");
										log.info("Successfully logged out of app");
										System.exit(0);
									case 2:

										break;
									case 3:
										break;
									case 4:
										break;
									case 5:
										break;
									case 6:
										break;
									default :
										log.info("entered option is invalid");
										break;
									}
								} while (ch != 6);
							} else {
								log.warn("invalid userid or password entered");
								break;
							}
						} else {
							log.warn("invalid userid or password entered");
							break;
						}
						break;
					case 2:
						log.info("entered employee login portal");
						break;
					case 3:
						// log.info("Thank you for using our Banking Services. " + "Goodbye....!");
						log.info("Going to MainMenu.........");
						break;
					case 4:
						System.exit(0);
					default:
						log.info("entered option is invalid");
						break;
					}
				} while (menuChoice != 3);
			case 3:
				break;
			case 4:
				log.info("Thanks for using our App.. See you soon. :)");
				break;
			default:
				log.warn("Invalid Choice... Please enter input between 1-4");
				break;
			}
		} while (ch != 4);
	}
}
