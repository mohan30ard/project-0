package com.bank.LoginPage;
import java.util.Scanner;
public class menuProject {
	public static int mainMenu() {
		int selection;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Generate a number\n2. Generate a character\n3. Generate a word\n0. Exit");
		selection = sc.nextInt();
		return selection;
	}
	public static void numberMenu() {
		int selection;
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"1: Generate a number in range [0, 100]\n"
				+ "2: Generate a number in range [-100, 100]\n"
				+ "3: Generate a number in specific range\n"
				+ "0: Return to main menu");
		selection = sc.nextInt();
		switch (selection) {
		case 1:
			int min = 0;
			int max = 100;
			int firstRand = (int) (Math.random() * (max - min + 1) + min);
			System.out.println("\nYour random number between 0 and 100 is " + firstRand);
			break;
		case 2:
			System.out.println("2nd gen");
			mainMenu();
			break;
		case 3:
			System.out.println("3rd gen");
			break;
		case 0:
			mainMenu();
			break;
		}
		sc.close();
	}
	public static int charMenu() {
		int selection;
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"1: Generate an uppercase letter\n"
				+ "2: Generate a lowercase letter\n"
				+ "3: Generate a digital character\n"
				+ "4: Generate a letter ordigital character\n"
				+ "0: Return to main menu");
		selection = sc.nextInt();
		return selection;
	}
	public static int wordMenu() {
		int selection;
		Scanner sc = new Scanner(System.in);
		System.out.println("1: Generate a word\n"
				+ "2: Generate a variable\n"
				+ "0: Return to main menu");
		selection = sc.nextInt();
		return selection;
	}
	public static int withinCharMenu() {
		int selection;
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"1: Generate an uppercase letter\n"
				+ "2: Generate a lowercase letter\n"
				+ "3: Generate a digital character\n"
				+ "4: Generate a letter ordigital character\n"
				+ "0: Return to main menu");
		selection = sc.nextInt();
		return selection;
	}
	public static void main(String[] args) {
		int userInput;
		userInput = mainMenu();
		switch (userInput) {
		case 1:
			numberMenu();
			break;
		case 2:
			charMenu();
			break;
		case 3:
			wordMenu();
			break;
		case 0:
			System.out.println("Thank you for using this program. Goodbye!");
			break;
		}
	}
}
