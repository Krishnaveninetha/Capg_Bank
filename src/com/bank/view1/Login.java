package com.bank.view1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;


import model1.UserDetails;

public class Login {
	static int count=0;
	private static UserDetails setInfo() {
		
		UserDetails ud=new UserDetails();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the accno and password: ");
		ud.setAccNo(s.nextInt());
		ud.setPassword(s.next());
		return ud;
	}
	public void m1() {
		UserDetails ud=new UserDetails();
		Login l1=new Login();
	ud=l1.setInfo();
	

	try {
	
		FileInputStream fis= new FileInputStream("D:\\bank\\UserDetails.txt");;
		ObjectInputStream ois= new ObjectInputStream(fis);
		ArrayList<UserDetails> userlist2 = (ArrayList<UserDetails>)ois.readObject();
		ois.close();
		
		String t2=ud.getPassword();
		
			
			if(ud.getAccNo()==(userlist2.get(0).getAccNo()))
			{
				if(t2.equals(userlist2.get(0).getPassword()))
				{
						System.out.println("account confirm");
				}
				else {
					System.out.println("incorrect pwsd");
				}
				

			}
			else
			{
				System.out.println(" account num doesn't exists");
			}
		
} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			 
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public static void main(String[] args) throws IOException {
			Login l=new Login();
			l.m1();
			
}
	
}
