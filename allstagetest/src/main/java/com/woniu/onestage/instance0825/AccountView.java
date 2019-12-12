package com.woniu.onestage.instance0825;
import java.util.Scanner;

public class AccountView {

	private AccountManager am=new AccountManager();
	
	public void registerView(){
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("�������û���");
			String accountName=sc.next();
			if(am.isExitAccountName(accountName)){
				
				System.out.println("��������û����Ѿ����ڣ�����������");
				continue;
				
			}
			
			System.out.println("����������");
			String accountPwd=sc.next();
			System.out.println("��ȷ������");
			String accountPwd1=sc.next();
			
			if(!accountPwd.equals(accountPwd1)){
				
				System.out.println("����������");
				continue;
			}
			//���û����������װΪ�˻�����
			Account account=new Account(accountName,accountPwd);
			am.addAccount(account);
			System.out.println("ע��ɹ�");
			break;
		}
	}
	
	public void loginView(){
		
		Scanner sc=new Scanner(System.in);
		int count=0;
		while(true){
			System.out.println("�������û���");
			String accountName=sc.next();
			System.out.println("����������");
			String accountPwd=sc.next();
			
			Account account=new Account(accountName, accountPwd);
			
			if(am.isExitAccout(account)){
				
				System.out.println("��¼�ɹ�");
				break;
			}
			else{
				//�����������Ĵ���
				count++;
				if(count>3){
					System.out.println("�����˻��Ѿ����ᡣ��������ϵͳ�����˳�");
					System.exit(0);//�˳�ϵͳ
				}
				else{
					System.out.println("n��������û����������벻��ȷ������������");
					continue;
				}
			}
		}
		
	}
	
	
	
	public  void transferView(){
		Scanner sc=new Scanner(System.in);
		String ans="y";
		while(ans.equals("y")){
			System.out.println("������Է��˻�");
			String accountName=sc.next();
			if(!am.isExitAccountName(accountName)){
				System.out.println("��������˻������ڣ�����������");
				continue;
			}
			
			System.out.println("������ת�˽��");
			double money=sc.nextDouble();
			
			am.transfer(accountName, money);
			
			System.out.println("�Ƿ�Ҫ����ת��");
			ans=sc.next();
		}
	}
	
	//չʾ�Լ��˻������
	public  void showMoney(){
		
		
		double money=am.getLoginUserBalance();
		System.out.println("�����˻����Ϊ:"+money);
	}
	
	
	//���ԣ�չʾ�����˻���Ϣ
	
	public void showAll(){
		Account accounts[]=am.getAccounts();
		for (int i = 0; i < am.getCount(); i++) {
			System.out.println(accounts[i]);
		}
		
		
	}
	
	//��Ǯ���棬�Լ����

}
