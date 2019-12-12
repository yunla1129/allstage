package com.woniu.onestage.instance0825;
import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		jiu();
	}
	public static boolean isRepeat(int a[][],int key){
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(key==a[i][j]){
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static void jiu(){
		Random r=new Random();
		int a[][]=new int[3][3];
		int index=0;
		while(true){
			int re=r.nextInt(9)+1;
			//判断不重复，如果不重复就放到数组中
			if(!isRepeat(a, re)){
				a[index/3][index%3]=re;
				index++;
			}
			//如果放慢了，就跳出
			if(index==9){
				break;
			}	
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("");
		}
		
	}
	public static void show(int a[]){
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static String tenTo8(int a){
		
		int n=a;
		String str="";
		while(n!=0){
			
			int t=n%8;
			n=n/8;
			str=t+str;
		}
		
		return str;
		
	}
	
	public static void showCount(){
		int count=0;
		for (int i = 0; i <=3; i++) {
			for (int j = 0; j <=3; j++) {
				for (int k = 0; k <=6; k++) {
					
					if(i+j+k==8){
						count++;
					}
				}
			}
		} 
		
		System.out.println(count);
	}

	public static void change(int a[]){
		
		for (int i = 0; i < a.length/2; i++) {
			int temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
		}
	}
}
