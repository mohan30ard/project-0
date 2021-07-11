package com.bank.LoginPage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Hashtable;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.bank.customer.CustomerDetails;

class MainMenuTest extends CustomerDetails{
	MainMenu test=new MainMenu();
	private static MainMenu menu;
	@BeforeAll
	public static void setData() {
	Hashtable<Integer,String> map=new Hashtable<>();
	map.put(28368987 , "password");
	MainMenu.map=map;
	
	}
	@Test
	void testuserPassword() {
		int userId=28368987;
		assertEquals("password", MainMenu.map.get(userId));	
	}
	@Test
	void testuserID() {
		int userId=28368987;
		assertTrue(MainMenu.map.containsKey(userId));
	}
}
