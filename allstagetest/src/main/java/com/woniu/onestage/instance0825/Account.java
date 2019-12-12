package com.woniu.onestage.instance0825;
public class Account {

	private String accountName;
	private String accountPwd;
	private double accountBlance;//”‡∂Ó
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String accountName, String accountPwd) {
		super();
		this.accountName = accountName;
		this.accountPwd = accountPwd;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountPwd() {
		return accountPwd;
	}

	public void setAccountPwd(String accountPwd) {
		this.accountPwd = accountPwd;
	}

	public double getAccountBlance() {
		return accountBlance;
	}
	
	//¥Ê»°«Æ
	public  void changeBlance(double _vb){
		
		accountBlance=accountBlance+_vb;
	}

	@Override
	public String toString() {
		return "Account [accountName=" + accountName + ", accountPwd=" + accountPwd + ", accountBlance=" + accountBlance
				+ "]";
	}
	
    
}
