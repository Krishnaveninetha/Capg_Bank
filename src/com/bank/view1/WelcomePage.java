package com.bank.view1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model1.UserDetails;

public class WelcomePage {
	

	public static void main(String[] args) {
		
		Registration rg=new Registration();
		Login lg=new Login();
		Scanner s=new Scanner(System.in);
		//ArrayList<UserDetails> sa1=new ArrayList<>();
		System.out.println("enter the choice: ");
		int choice=s.nextInt();
		switch(choice)
		{
		case 1:
				//rg.main1(null);
				break;
		case 2:
			
			
				//lg.m1(null);
			
			 break;
		}
	}
	
	}

