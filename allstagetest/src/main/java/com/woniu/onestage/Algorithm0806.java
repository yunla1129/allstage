package com.woniu.onestage;

import java.util.Scanner;

public class Algorithm0806 {

	
	public static void main(String[] args) {
//		test1();
//		test2();
//		test3();
		test4();
//		test5();
//		test6();
//		test7();
//		test8();

	}
	
	public static void test1(){
		int a = 5;
		int b = 8;
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a= "+a+","+"b="+b);
	}

	public static void test2(){
		int a = 10;
		long b = 8997689076l;
		double c = 5.98;
		float d = 3.68f;
		long s1 = a + b;
		double s2 = a + b * c + d;
		int s3 = (int)s2;
		long s4 = a / b;
		long s5 = a % b;
		System.out.println("a="+a+","+"b="+b+","+"c="+c+","+"d="+d
			+","+"s1="+s1+","+"s2="+s2+","+"s3="+s3+","+"s4="+s4+","+"s5="+s5);
		
	}
	
	public static void test3(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数：");
		double a = scanner.nextDouble();
		if (a >= 0) {
			System.out.println(a);
		}else {
			System.out.println(0-a);
		}
		
	}
	
	public static void test4(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数：");
		double a = scanner.nextDouble();
		System.out.println("请输入另外一个数：");
		double b = scanner.nextDouble();
		double c =a/b*1000+0.5;
		int d = (int)c;
		double f = d/1000.0;
		System.out.println(c);
		System.out.println(f);
	}
	
	public static void test5(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份：");
		int a = scanner.nextInt();
		if ((a % 4 == 0 && a % 100 != 0)||a % 400 == 0) {
			System.out.println(a+"为闰年");
		}
		else {
			System.out.println(a+"为平年");
		}
	}
	
	public static void test6(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int a = scanner.nextInt();
		if (a % 2 == 0 | a == 0) {
			System.out.println(a+"是偶数！");
		}
		
	}
	
	public static void test7(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int a = scanner.nextInt();
		System.out.println("请输入另外一个数：");
		int b = scanner.nextInt();
		if (a > b) {
			System.out.println(a);
		}else if (a < b) {
			System.out.println(b);
		}else {
			System.out.println("a:"+a+"与b:"+b+"相等");
		}
		
	}
	
	public static void test8(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int a = scanner.nextInt();
		System.out.println("请输入另外一个数：");
		int b = scanner.nextInt();
		System.out.println("请再输入一个数：");
		int c = scanner.nextInt();
		if (a > b && b > c || a > c && c > b) {
			System.out.println(a);
		}
		else if (b > a && a > c || b > c && c > a) {
			System.out.println(b);
		}
		else{
			System.out.println(c);
		}
	}
}
