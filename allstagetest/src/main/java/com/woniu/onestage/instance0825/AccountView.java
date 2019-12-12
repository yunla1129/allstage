package com.woniu.onestage.instance0825;
import java.util.Scanner;

public class AccountView {

	private AccountManager am=new AccountManager();
	
	public void registerView(){
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("请输入用户名");
			String accountName=sc.next();
			if(am.isExitAccountName(accountName)){
				
				System.out.println("您输入的用户名已经存在，请重新输入");
				continue;
				
			}
			
			System.out.println("请输入密码");
			String accountPwd=sc.next();
			System.out.println("请确认密码");
			String accountPwd1=sc.next();
			
			if(!accountPwd.equals(accountPwd1)){
				
				System.out.println("请重新输入");
				continue;
			}
			//将用户名和密码封装为账户对象
			Account account=new Account(accountName,accountPwd);
			am.addAccount(account);
			System.out.println("注册成功");
			break;
		}
	}
	
	public void loginView(){
		
		Scanner sc=new Scanner(System.in);
		int count=0;
		while(true){
			System.out.println("请输入用户名");
			String accountName=sc.next();
			System.out.println("请输入密码");
			String accountPwd=sc.next();
			
			Account account=new Account(accountName, accountPwd);
			
			if(am.isExitAccout(account)){
				
				System.out.println("登录成功");
				break;
			}
			else{
				//限制密码错误的次数
				count++;
				if(count>3){
					System.out.println("您的账户已经冻结。。。。，系统即将退出");
					System.exit(0);//退出系统
				}
				else{
					System.out.println("n您输入的用户名或者密码不正确，请重新输入");
					continue;
				}
			}
		}
		
	}
	
	
	
	public  void transferView(){
		Scanner sc=new Scanner(System.in);
		String ans="y";
		while(ans.equals("y")){
			System.out.println("请输入对方账户");
			String accountName=sc.next();
			if(!am.isExitAccountName(accountName)){
				System.out.println("您输入的账户不存在，请重新输入");
				continue;
			}
			
			System.out.println("请输入转账金额");
			double money=sc.nextDouble();
			
			am.transfer(accountName, money);
			
			System.out.println("是否要继续转账");
			ans=sc.next();
		}
	}
	
	//展示自己账户的余额
	public  void showMoney(){
		
		
		double money=am.getLoginUserBalance();
		System.out.println("您的账户余额为:"+money);
	}
	
	
	//测试，展示所有账户信息
	
	public void showAll(){
		Account accounts[]=am.getAccounts();
		for (int i = 0; i < am.getCount(); i++) {
			System.out.println(accounts[i]);
		}
		
		
	}
	
	//存钱界面，自己完成

}
