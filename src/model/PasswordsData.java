package model;

import java.util.ArrayList;

public class PasswordsData {
	
	
		
	public PasswordsData(String pass) {
		this.pass = pass;
	}
	
	public String pass;


	public static ArrayList<String> passwords = new ArrayList<>();
		
		public static void addPassword(String pass) {
			
			passwords.add(pass);
		}
		
		public static ArrayList<String> getData(){
			return passwords;
		}
		
		

	

}
