package model1;

import java.io.Serializable;

public class UserDetails implements Serializable{
		
		private int accNo;
		private long phoneNo;
		private String password;
		
		public int getAccNo() {
		return accNo;
	}

	public void setAccNo(long pancardNo) {
		this.accNo = accNo;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password=password;
	}


}
