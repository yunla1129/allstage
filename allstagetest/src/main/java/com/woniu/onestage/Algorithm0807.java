package com.woniu.onestage;
import java.util.Scanner;


public class Algorithm0807 {

	public static void main(String[] args) {
//		t1();
		
//		float re = t2(3.4f, 5.4f);
//		System.out.println(re);
		
//		int c = t3(0.9876);
//		System.out.println(c);
		
//		t4(99);
		
//		t5(-90);
		
//		t6(67, 79);
		
//		int se = t7(56, 78, 99);
//		System.out.println(se);
		
//		int he = t8(20);
//		System.out.println(he);
		
//		t9(20);
		
//		t10(3);
		
//		t11(78);
		
//		t12(3);
		
//		t13(7);
		
//		int gy = t14(28, 12);
//		System.out.println(gy);
		
//		int gb = t15(30, 12);
//		System.out.println(gb);
		
//		t16();
		
		
	}
//	��һ�⣺��ӡ:--
	public static void  t1(){
		for(int i = 0;i < 60;i++){
			System.out.print("-");
		}
		
	}
	
//	�ڶ��⣺������������֮��
	public static float t2(float a,float b){
		float c = a / b;
		return c;
	}
	
//	�����⣺��һ������������ȡ��
	public static int t3(double a){
		a = a + 0.5;         //�Ӹ�0.5�������Գ�����
		int b = (int)a;      //ǿת��int�ͣ����Զ��������
		return b;
	}
	

//	�����⣺�ж�һ�����Ƿ�Ϊ����
	public static void t4(int n){
		if (n % 2 != 0) {    //������2���಻����0��Ϊ����
			System.out.println(n+"Ϊ����");
		}
		
	}
	
	
//	�����⣺��һ�����ľ���ֵ
	public static void t5(int a){
		if (a >= 0) {        //a�����0ʱ������ֵ����������ֱ���������
			System.out.println(a);
		}else {              //aС��0ʱ������ֵΪ0-a
			System.out.println(0-a);
		}
	}
	
	
//	�����⣺�������������ֵ
	public static void t6(int a, int b){
		if (a > b) {         //һ���ĸ�������ĸ�
			System.out.println(a);
		}else  {
			System.out.println(b);
		}
	}
	
	
//	�����⣺�������������ֵ
	public static int t7(int a, int b, int c){
		int max;			//�ȶ���һ�����������ڴ�ź���ȽϺ����ֵ
		if (a > b) {
			max = a;		//a��b�Ƚϣ��ĸ���ֵ�󣬾Ͱ��ĸ���ֵ����max
		}else {
			max = b;
		}
		if (max > c) {      //�����max��cȥ�Ƚϣ��ĸ����ĸ��������������������ֵ
			return max;
		}else{
			return c;
		}
		
	}
	
	
//	�ڰ��⣺��1-n֮��
	public static int t8(int n){
		int sum = 0;         //�ȶ���һ�����ۼӺ͵ı���
		for (int i = 1; i <= n; i++) {
			sum = sum + i;   //��һ�ε��ۼӺ��뵱ǰ���������
		}
		return sum;
	}
	
	
//	��ʮ�⣺��ӡ��2012����n���ڵ���������
	public static void t9(int n){
		for(int i = 2012; i <=2012 + n; i++){    //��2012����i���2012��ʼ
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				System.out.println(i + "Ϊ����"); 
				//if�������������������������һ���ɡ�
			}
		}
	}
	
	
//	��ʮһ�⣺����  1!+2!+3!+ ��+n!
	public static void t10(int n){//��������������ֱ�����ﴫֵ��ѭ�����������ֹ
		int a = 1;        //������������ڽ����۳�
		int sum = 0;
		for (int i = 1; i <= n ; i++) {
			a = a * i;
			sum = sum + a; //�ۼӣ�sum��ѭ���ⶨ�����������ۼӵ���ֵ������дѭ���ڣ�sum
			               //ֵÿ�λ��Ϊ0
		}
		System.out.println(sum);
	}
	
//	�ھ��⣺��1-n�е�����֮��
	public static void t11(int n){
		int sum = 0;
		for (int i = 1; i <= n; i+=2) { //�ۼӺ�������һ����ֻ���i++����i+=2
			sum = sum + i;              //��Ϊ�������  
		}
		System.out.println(sum);
		
	}
	
	
//	��ʮ���⣺��Sn=a+aa+aaa+����+aa����aֵ֮,����a��һ������,n�ɼ�������
	public static void t12(int a){
		Scanner scanner = new Scanner(System.in);//��������
		System.out.println("������n:");
		int n = scanner.nextInt();  //���������n����
		int sum = 0;
		int b = 0;
		for (int i = 1; i <= n; i++) {
			
			b = b * 10 + a; //b���ڴ���ÿ�α仯���ֵ��ǰһ������10�ټ�a
			sum = sum + b;  //sum�ۼ�
		}
		System.out.println(sum);
		
	}
	
	
//	��ʮ���⣺�ж�һ�����Ƿ�Ϊ����
	public static void t13(int n){
		  //��flag��ǣ�Ĭ�����true
		if (n < 2) {
			System.out.println(n + "��������");
		}else{
			boolean flag = false;//��flag��ǣ�Ĭ�����false
			for (int i = 2; i < n; i++) {
				
				if (n % i != 0) {   //��������͵�n-1Ϊֹ��ÿ�������࣬��������0��Ϊ����
					flag = true;    //����ʱ���һ��Ϊfalse������Ϳ�����false��true
					break;          //������������break����ѭ����һ����������дelse������9%2��=0����
				}                   //9%3=0,else�Ļ��ͻ����9�ͻ�if��else������
			}                       //����Ҫע��
			if (flag) {
				System.out.println(n + "��������");
			}                        
			else{
				System.out.println(n + "������");
			}
		}
		
	}
	
	
//	��ʮ���⣺�������������Լ��
	public static int t14(int a, int b){
		int max = 0;  //����һ���������Լ��
		for (int i = 1; i <= b; i++) {
			if (a % i == 0 && b % i == 0) {//���������ֱ���i���඼����0,
					max = i;               //iΪ�������Ĺ�Լ��
			}
		}
		return max;
		
	}
	
	
//	��ʮ���⣺����������������С������
	public static int t15(int a1, int b1){
		return (a1*b1)/(t14(a1,b1));  //��a1*b1�ٳ�������ķ����������������
		                              //a1��b1������֮���������ǵ����Լ��
	}                                 //Ϊ���ǵ���С������
	
	
//	��ʮ���⣺С�����·�������
	public static void t16(){
		
		double zh = 100; //����һ���ܸ߶ȣ���ʼֵ����Ϊ�տ�ʼ�ĸ߶�100
		double fh = 50;  //���巴���߶ȣ���ʼֵΪ�տ�ʼ�߶ȵ�һ��
		int count = 1;   //�ƴ���
		while (fh >= 0.1) { //�����߶ȴ����0.1ʱ��ȥ����
			zh = zh + 2*fh;  //�ۼ�
			fh = fh / 2;
			count++;
			
		}
		System.out.println("�ڵ�"+count+"��֮�󷴵��߶�С��0.1��");
		System.out.println("��һ�����ʱ������"+zh+"��");
	}
	
	
}
