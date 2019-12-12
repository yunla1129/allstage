package com.woniu.onestage.instance0825;
import java.util.Scanner;

public class Main {
	
	private AccountView  accountView=new AccountView();
	public void mainMenu(){
		Scanner sc=new Scanner(System.in);
		
		while(true){
			System.out.println("1.注册");
			System.out.println("2.登录");
			System.out.println("请选择");
			int se=sc.nextInt();
			
			switch (se) {
			case 1:
				accountView.registerView();
				
				break;
			case 2:
				accountView.loginView();
				subMenu();
				break;
	
			default:
				break;
			}
		}
		
	}
	
	
	public void subMenu(){
		
		Scanner sc=new Scanner(System.in);
		
		while(true){
			System.out.println("1.转账");
			System.out.println("2.查询余额");
			System.out.println("3.存钱");
			System.out.println("4.取钱");
			System.out.println("5.展示所有账户");
			System.out.println("6.返回十一级");
			System.out.println("请选择");
			int se=sc.nextInt();
			
			switch (se) {
			case 1:
				accountView.transferView();
				break;
			case 2:
				accountView.showMoney();
				break;
			case 3:
				//启动存钱界面
				break;
			case 4:
				//启动取钱界面
				break;
			case 5:
				accountView.showAll();
				break;
			default:
				mainMenu();
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		Main m=new Main();
		m.mainMenu();//启动主菜单
		
	}

}
