package com.bank.LoginPage;
import java.util.Hashtable;
import java.util.Scanner;
import com.bank.customer.CustomerDetails;

public class Registration extends CustomerDetails{	
	public static void main(String[] args) {
		Registration r1=new Registration();
		Hashtable<Integer,String> map=new Hashtable<>();
		try(Scanner scanner = new Scanner(System.in)){
			System.out.print("Enter your First Name => ");
			String firstName= scanner.nextLine();
			r1.setFirstName(firstName);
			System.out.print("Enter your Last Name => ");
			String lastName= scanner.nextLine();
			r1.setLastName(lastName);
			System.out.print("Enter your Email Id => ");
			String emailId= scanner.nextLine();
			r1.setEmailId(emailId);
			try {
			System.out.print("Enter your 8 digit userId => ");
			int userId= Integer.parseInt(scanner.nextLine());
			r1.setUserId(userId);
			}
			catch(Exception ex) {
				System.out.println("Enter  only 8 digit numbers");
			}
			System.out.print("Enter your Password => ");
			String password= scanner.nextLine();
			r1.setPassword(password);
			map.put(r1.getUserId(),password);
			System.out.print("Enter your Mobile Number => ");
			long mobileNumber= Long.parseLong(scanner.nextLine());
			r1.setMobileNumber(mobileNumber);
			
			printDetails(r1);
		}
	}
	
	private static void printDetails(Registration r1) {
		System.out.println(r1.getFirstName());
		System.out.println(r1.getLastName());
		System.out.println(r1.getEmailId());
		System.out.println(r1.getUserId());
		System.out.println(r1.getPassword());
		System.out.println(r1.getMobileNumber());
	}

}
