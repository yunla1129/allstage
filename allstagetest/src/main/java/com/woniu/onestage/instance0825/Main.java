package com.woniu.onestage.instance0825;
import java.util.Scanner;

public class Main {
	
	private AccountView  accountView=new AccountView();
	public void mainMenu(){
		Scanner sc=new Scanner(System.in);
		
		while(true){
			System.out.println("1.ע��");
			System.out.println("2.��¼");
			System.out.println("��ѡ��");
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
			System.out.println("1.ת��");
			System.out.println("2.��ѯ���");
			System.out.println("3.��Ǯ");
			System.out.println("4.ȡǮ");
			System.out.println("5.չʾ�����˻�");
			System.out.println("6.����ʮһ��");
			System.out.println("��ѡ��");
			int se=sc.nextInt();
			
			switch (se) {
			case 1:
				accountView.transferView();
				break;
			case 2:
				accountView.showMoney();
				break;
			case 3:
				//������Ǯ����
				break;
			case 4:
				//����ȡǮ����
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
		m.mainMenu();//�������˵�
		
	}

}
