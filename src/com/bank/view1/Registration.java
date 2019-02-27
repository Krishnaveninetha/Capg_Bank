
package com.bank.view1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import model1.UserDetails;
public class Registration {
	static int count=1;

	public static void main(String[] args) {
		ArrayList<UserDetails> sa1=new ArrayList<>();	
		sa1.add(setInfo());
	 
		
		try {
			 FileOutputStream fos = new FileOutputStream("D:\\bank\\Userdetails.txt");
		
		ObjectOutputStream oos= new ObjectOutputStream(fos);;
		
			
			oos.writeObject(sa1);
			System.out.println("done");

			fos.close();
		
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	
	 private static model1.UserDetails setInfo() {
		UserDetails ud=new UserDetails();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the details: "+count);
		Random random=new Random();
		
		
		ud.setPhoneNo(s.nextLong());
		ud.setPassword(s.next());
		int accno=Math.abs(random.nextInt());
		System.out.println("accno generated: "+accno);
		//System.out.println("successfully registered");
		//System.out.println("login page");
		count++;
		return ud;
		}
}
