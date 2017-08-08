package com.signup.example;

import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

public class SignUpFormjdo {
	@Persistent
	private String userName;
	
	@PrimaryKey
	@Persistent
//	@Extension(vendorName="datanucleus", key="gae.encoded-pk", value="true")
	private String email ;
	
	@Persistent
	private String userPass;
	@Persistent
	private String phonenumber;
	
	public SignUpFormjdo(String userName,String email,  String userPass, String phonenumber) {
		this.userName = userName;
		this.email=email;
		this.userPass = userPass;
		this.phonenumber = phonenumber;
	}

	 public String getemail() {
	        return email;
	    }
	 public void setemail(String email)
	 {
		 this.email=email;
	 }

	public String getuserName() {
		return userName;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}

	
	

	public String getuserPass() {
		return userPass;
	}

	public void setuserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getphonenumber() {
		return phonenumber;
	}

	public void setphonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

}
