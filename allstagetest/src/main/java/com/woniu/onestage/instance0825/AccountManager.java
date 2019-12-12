package com.woniu.onestage.instance0825;
public class AccountManager {


	  private Account accounts[];//��źܶ���˻���Ϣ
	  private  int size=5;//�������
	  private int count;//ʵ������
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
		  
	  //�����˻�
	  public void addAccount(Account account){
		  accounts[count]=account;
		  count++;
		  
	  }

	  //��֤�˻������Ƿ����
	  public  boolean  isExitAccout(Account account){
		  
		  for (int i = 0; i < count; i++) {
			  
			  if(accounts[i].getAccountName().equals(account.getAccountName())&&accounts[i].getAccountPwd().equals(account.getAccountPwd())){
				  //����½�ɹ����û����û����������
				  loginUser=account.getAccountName();
				  return true;
				  
			  }
			
		  }
		  
		  return false;
		  
	  }
	  
	  //��֤�û����Ƿ����
	  public boolean isExitAccountName(String accountName){
		  
		  for (int i = 0; i < count; i++) {
			  
			  if(accounts[i].getAccountName().equals(accountName)){
				  //����½�ɹ����û����û����������
				  
				  return true;
				  
			  }
			
		  }
		  
		  return false;
		  
	  }
	  
	  //ת��
	  public  void transfer(String otherAccountName,double  vb){
		  
		  //�����ҵ������˻�
		  for (int i = 0; i < count; i++) {
			  //�ҵ�¼���˻�
			  if(accounts[i].getAccountName().equals(loginUser)){
				  
				  accounts[i].changeBlance(-vb);
			  }
			  //������һ���˻�
			  if(accounts[i].getAccountName().equals(otherAccountName)){
				  
				  accounts[i].changeBlance(vb);
			  }
		  }
	  }
	  
	  public double getLoginUserBalance(){
		  
		
			  
			 
			  for (int i = 0; i < count; i++) {
				  //�ҵ�¼���˻�
				  if(accounts[i].getAccountName().equals(loginUser)){
					  
					  return accounts[i].getAccountBlance();
				  }
				
			  }
			  
			  return 0;
		  
	  }
	  
	  
	  //��Ǯ
	  public  void transfer(double  vb){
		  
		  //�����ҵ������˻�
		  for (int i = 0; i < count; i++) {
			  //�ҵ�¼���˻�
			  if(accounts[i].getAccountName().equals(loginUser)){
				  
				  accounts[i].changeBlance(vb);
			  }
			
			  
		  }
	  }
	  
	  
	 //ȡǮ
	  
	  
	  //���Թ����У�������е��˻�
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
