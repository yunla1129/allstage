package com.woniu.onestage.instance0825;
public class AccountManager {


	  private Account accounts[];//存放很多个账户信息
	  private  int size=5;//最大容量
	  private int count;//实际容量
	  private String loginUser;
	  
	  
	  public AccountManager() {
		// TODO Auto-generated constructor stub
		  
		  accounts=new Account[size];
		  
		  accounts[0]=new Account("admin","123456");
		  accounts[0].changeBlance(100);
		  accounts[1]=new Account("gly","123456");
		  accounts[1].changeBlance(400);
		  count=2;
		  
	  }
	  
	  public AccountManager(int size) {
			// TODO Auto-generated constructor stub
			  this.size=size;
			  accounts=new Account[size];
			  accounts[0]=new Account("admin","123456");
			  accounts[0].changeBlance(100);
			  accounts[1]=new Account("gly","123456");
			  accounts[1].changeBlance(400);
			  count=2;
			  
	  }
		  
	  //增加账户
	  public void addAccount(Account account){
		  accounts[count]=account;
		  count++;
		  
	  }

	  //验证账户对象是否存在
	  public  boolean  isExitAccout(Account account){
		  
		  for (int i = 0; i < count; i++) {
			  
			  if(accounts[i].getAccountName().equals(account.getAccountName())&&accounts[i].getAccountPwd().equals(account.getAccountPwd())){
				  //将登陆成功的用户的用户名存放起来
				  loginUser=account.getAccountName();
				  return true;
				  
			  }
			
		  }
		  
		  return false;
		  
	  }
	  
	  //验证用户名是否存在
	  public boolean isExitAccountName(String accountName){
		  
		  for (int i = 0; i < count; i++) {
			  
			  if(accounts[i].getAccountName().equals(accountName)){
				  //将登陆成功的用户的用户名存放起来
				  
				  return true;
				  
			  }
			
		  }
		  
		  return false;
		  
	  }
	  
	  //转账
	  public  void transfer(String otherAccountName,double  vb){
		  
		  //遍历找到两个账户
		  for (int i = 0; i < count; i++) {
			  //找登录的账户
			  if(accounts[i].getAccountName().equals(loginUser)){
				  
				  accounts[i].changeBlance(-vb);
			  }
			  //找另外一个账户
			  if(accounts[i].getAccountName().equals(otherAccountName)){
				  
				  accounts[i].changeBlance(vb);
			  }
		  }
	  }
	  
	  public double getLoginUserBalance(){
		  
		
			  
			 
			  for (int i = 0; i < count; i++) {
				  //找登录的账户
				  if(accounts[i].getAccountName().equals(loginUser)){
					  
					  return accounts[i].getAccountBlance();
				  }
				
			  }
			  
			  return 0;
		  
	  }
	  
	  
	  //存钱
	  public  void transfer(double  vb){
		  
		  //遍历找到两个账户
		  for (int i = 0; i < count; i++) {
			  //找登录的账户
			  if(accounts[i].getAccountName().equals(loginUser)){
				  
				  accounts[i].changeBlance(vb);
			  }
			
			  
		  }
	  }
	  
	  
	 //取钱
	  
	  
	  //测试过程中，获得所有的账户
	  public Account[] getAccounts() {
		return accounts;
	 }
	  
	  public int getCount() {
		return count;
	}
	  
	  public int getSize() {
		return size;
	}
	  
}
