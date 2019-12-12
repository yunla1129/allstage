package com.woniu.onestage;

import java.util.Scanner;


public class Algorithm0812 {

	public static void main(String[] args) {
//		int a[] = {45,67,23,21,22,90,11};
//		maoPao(a);
//		xuanZe(a);
//		shuZu(a);

//		int b[] = {2,12,23,34,66,78,99};
//		chaShu(b, 25);

//		int c[]={98,87,76,66,56,43,22,11};
//		int re = erFenCha(c, 66);
//		System.out.println(re);

//		int a[][] = {{87,98,76},{43,22,11},{67,23,21}};
//		int re = max(a);
//		System.out.println(re);

//		printYh(6);

		jiuGongGe();

//		int s[] = shanChu(a, 23);
//		shuZu(s);

//		String string = jinZhiZhuanhuan(100);
//		System.out.println(string);

//		double re = ciFang();
//		System.out.println(re);

//		 zhiShuHe(20);

	}

	public static void shuZu(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void maoPao(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	public static void xuanZe(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[index]) {
					index = j;
				}
			}
			if (index != i) {
				int temp = a[i];
				a[i] = a[index];
				a[index] = temp;
			}
		}
	}
//    ð����������n��Ԫ�أ���һ������n-1�����򣬼����鳤��-1�Σ�������forѭ��������
//	                          ����ÿһ��ǰһ��Ԫ��iλ���һ��Ԫ��i+1λ�Ƚϣ���ķź��棬���ᾭ������
//		              ����-i-1�αȽϣ�����ÿ�ֵıȽ��ֿ�������ѭ��������������ʹ��Ƕ��ѭ������
//		               ����ƴ������ڲ����ÿ�ֵıȽϣ���ÿ�ֱȽ�ʱ����ǰһ��Ԫ�ش��ں�һ��Ԫ��ʱ��
//		               ��ǰһ��Ԫ������ţ��ŵ�ʱ���ȸ�����������һ�£��ٺͺ�һ��Ԫ�ص���λ�ã���
//		               ��ÿ�����򶼻��и���������ţ����ս��ź�λ�õ��������һ�£����ɡ�
//		
//    ѡ������Ƕ��ѭ������ͬ��ð��������ǣ���ÿ����������һ���ҳ������ٺ͵������ȣ�������
//           ������ٺ͵��ĸ��ȣ��������������±ȣ��ȵ�ʱ��������λ�ã�ֻ�Ѻ����λ�ø��������
//           ��󿴴�����ǲ�����һ��ʼ���ں����λ�ã�������ǣ���һ��ʼռ�ݺ���λ�õ��� �ʹ�
//           ��һ��ʼ��λ������������������һ�¼��ɡ�

	public static void chaShu(int a[], int key) {

		int index = a.length;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > key) {
				index = i;
				break;
			}

		}
		int b[] = new int[a.length + 1];

		for (int i = 0; i < index; i++) {
			b[i] = a[i];
		}
		b[index] = key;
		for (int i = index; i < a.length; i++) {
			b[i + 1] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	public static int erFenCha(int a[], int key) {
		int left = 0;
		int right = a.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (key == a[mid]) {
				return mid;
			}
			if (key > a[mid]) {
				right = mid - 1;
			}
			if (key < a[mid]) {
				left = mid + 1;
			}

		}
		return -1;

	}

	public static int max(int a[][]) {
		int m = a[0][0];
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > m) {
					m = a[i][j];
				}
			}
		}
		return m;
	}

	public static void printYh(int n) {
		int a[][] = new int[n][];
		for (int i = 0; i < a.length; i++) {
			a[i] = new int[i + 1];
			for (int j = 0; j < a[i].length; j++) {
				if (j == 0 || j == i) {
					a[i][j] = 1;
				} else {
					a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static void jiuGongGe() {
		int a[][] = new int[3][3];
		int b = (int) (Math.random() * 10);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int j2 = 0; j2 < 3; j2++) {
					for (int k = 0; k < 3; k++) {
						if (b == a[j2][k]) {
							b = (int) (Math.random() * 10);
							j2 = 0;
							k = -1;
						}
					}
				}

				a[i][j] = b;
				System.out.print(a[i][j] + " ");

			}
			System.out.println("");
		}
	}

	public static int[] shanChu(int a[], int key) {
		int b[] = new int[a.length - 1];
		int index = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				index = i;
			}
		}
		for (int i = 0; i < index; i++) {
			b[i] = a[i];
		}

		for (int i = index; i < b.length; i++) {
			b[i] = a[i + 1];
		}
		return b;
	}

	public static String jinZhiZhuanhuan(int n) {

		String str = "";
		while (n > 0) {
			int t = n % 16;
			switch (t) {
			case 10:
				str = "A" + str;
				break;
			case 11:
				str = "B" + str;
				break;
			case 12:
				str = "C" + str;
				break;
			case 13:
				str = "D" + str;
				break;
			case 14:
				str = "E" + str;
				break;
			case 15:
				str = "F" + str;

			default:
				break;
			}
			str = t + str;
			n = n / 16;
		}
		return str;
	}

	public static double ciFang() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������x:");
		int x = scanner.nextInt();
		System.out.println("������ָ��y:");
		int y = scanner.nextInt();
		double num = 1;

		if (y >= 0) {
			for (int i = 0; i < y; i++) {
				num = num * x;
			}
			return (int) num;
		} else {
			for (int i = 0; i < -y; i++) {
				num = num * x;
			}
			return 1 / num;
		}
	}

	public static void zhiShuHe(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			boolean flag = zs(i);
			if (flag) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

	public static boolean zs(int a) {
		if (a < 2) {
			return false;
		} else {
			for (int j = 2; j < a; j++) {
				if (a % j == 0) {
					return false;
				}
			}
			return true;
		}

	}

}
