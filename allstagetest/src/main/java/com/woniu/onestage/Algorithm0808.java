package com.woniu.onestage;

public class Algorithm0808 {

	public static void main(String[] args) {
//		test1();
		test2(10);
//		test3(6);
//		test4();
//		test5();
		
//		int a[] = {23,33,45,12,66,78};
//		test6(a, 11);
		
//		int re = test7(a);
//		System.out.println(re);
		
//		test8(a,4);
		
//		test9(10, 4);
		
//		test10(a);
	}
	
//	1.�����λ��ˮ�ɻ���
	public static void test1(){
		
		for (int a  = 100; a < 1000; a++) {
			int a1 = a % 10;
			int a2 = (a - a1) / 10 % 10;
			int a3 = (a - a2 * 10 - a1 ) / 100;
			
			if (a == a1*a1*a1 + a2*a2*a2 + a3*a3*a3) {
				System.out.println(a+"��ˮ�ɻ���");
			}
			
		}
	}
	
	
//	2.���n���ڵ�����Щ��������
	public static void test2(int n){
		
		for (int i = 0; i < n; i++) {
			boolean flag = zs(i);
			if (flag) {
			System.out.println(i + "������");
			}
		}
	}
	public static boolean zs(int a){
		if (a < 2) {
			return false;
		}else{
			for (int j = 2; j < a; j++) {
				if (a % j == 0) {
					return false;
				}
			}
			return true;
		}
	}
	
	
//	3.��ӡ��*��ɵĵ���������
	public static void test3(int n){
		for (int i = 1; i < n ; i++) {
			for (int k = n - i - 1; k >0 ; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
//	4.��ӡ�žų˷���
	public static void test4(){
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "��" + i +"="+(i*j)+"\t");
			}
			System.out.println("");
		}
	}
	
	
//	5. 1Ԫֽ�Ҷһ��������
	public static void test5(){
		int count = 0;
		for (int one = 0; one <= 100 ; one++) {
			for (int two = 0; two <= 50; two++) {
				for (int five = 0; five <= 20; five++) {
					if (one+two+five == 50) {
						count++;
						System.out.println("1����"+one+"��"+"\t"+"2����"+two+"��"
						+"\t"+"5����"+five+"��");
					}
				}
			}
			
		}
		System.out.println("һ����"+count+"�����");
	}
	
	
//	6.��һ������������һ�������������ݣ�
	public static void test6(int a[],int key){
		
		int b[] = new int[a.length + 1];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		b[b.length - 1] = key;
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
	
	
//	7.��һ����������ֵ
	public static int test7(int []a){
		int temp = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > temp) {
				temp = a[i];
			}
		}
		return temp;
		
	}
	
	
//	8.��һ����������kλ
	public static void test8(int a[], int k){
		 
		for (int j = 1; j <= k ; j++) {
			int temp = a[0];
			for (int i = 0; i < a.length - 1; i++) {
				a[i] = a[i+1];
			}
			a[a.length - 1] = temp;
			
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	
	
//	9.��������
	public static void test9(int n, int k){
		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= k ; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count % 2 == 1) {
				System.out.println(i);
			}
			
		}
		
	}
	
	
//	10.ð������
	public static void test10(int a[]){
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				
				if (a[j] > a[j+1] ) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
				}
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	
	
	

}
