package com.edubridge.thane;

import java.util.*;

public class HelloWorld {

	public static void main(String[] args) {
		String name="Pranay";
		
		System.out.println(name);
		
		char ch[]= {'M','A','N','S','I'};
		
		String s1=new String(ch);
		System.out.println(s1);
		
		System.out.println(s1.length());
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your username: ");
		String uname=sc.nextLine();
		
		System.out.println("Enter password: ");
		String pass=sc.nextLine();
		
		if(uname.equals(pass)) {
			System.out.println("Authorized");
		}
		else {
			System.out.println("Wrong credentials");
		}
	
	}
}