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
//	第一题：打印:--
	public static void  t1(){
		for(int i = 0;i < 60;i++){
			System.out.print("-");
		}
		
	}
	
//	第二题：求两个浮点数之商
	public static float t2(float a,float b){
		float c = a / b;
		return c;
	}
	
//	第三题：对一个数四舍五入取整
	public static int t3(double a){
		a = a + 0.5;         //加个0.5让它可以超五入
		int b = (int)a;      //强转成int型，会自动变成整数
		return b;
	}
	

//	第四题：判断一个数是否为奇数
	public static void t4(int n){
		if (n % 2 != 0) {    //给数与2求余不等于0即为奇数
			System.out.println(n+"为奇数");
		}
		
	}
	
	
//	第五题：求一个数的绝对值
	public static void t5(int a){
		if (a >= 0) {        //a大等于0时，绝对值就是它本身，直接输出即可
			System.out.println(a);
		}else {              //a小于0时，绝对值为0-a
			System.out.println(0-a);
		}
	}
	
	
//	第六题：求两个数的最大值
	public static void t6(int a, int b){
		if (a > b) {         //一比哪个大输出哪个
			System.out.println(a);
		}else  {
			System.out.println(b);
		}
	}
	
	
//	第七题：求三个数的最大值
	public static int t7(int a, int b, int c){
		int max;			//先定义一个变量，用于存放后面比较后的数值
		if (a > b) {
			max = a;		//a和b比较，哪个的值大，就把哪个的值赋给max
		}else {
			max = b;
		}
		if (max > c) {      //最后让max和c去比较，哪个大，哪个就是最终三个数的最大值
			return max;
		}else{
			return c;
		}
		
	}
	
	
//	第八题：求1-n之和
	public static int t8(int n){
		int sum = 0;         //先定义一个放累加和的变量
		for (int i = 1; i <= n; i++) {
			sum = sum + i;   //上一次的累加和与当前的数再相加
		}
		return sum;
	}
	
	
//	第十题：打印自2012年起，n年内的所有闰年
	public static void t9(int n){
		for(int i = 2012; i <=2012 + n; i++){    //从2012年起，i需从2012开始
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				System.out.println(i + "为闰年"); 
				//if那是闰年的两个条件，满足其一即可。
			}
		}
	}
	
	
//	第十一题：计算  1!+2!+3!+ …+n!
	public static void t10(int n){//给个参数，可以直接往里传值，循环到这个数截止
		int a = 1;        //定义这个量用于接收累乘
		int sum = 0;
		for (int i = 1; i <= n ; i++) {
			a = a * i;
			sum = sum + a; //累加，sum在循环外定义这样才能累加的上值，否则写循环内，sum
			               //值每次会变为0
		}
		System.out.println(sum);
	}
	
//	第九题：求1-n中的奇数之和
	public static void t11(int n){
		int sum = 0;
		for (int i = 1; i <= n; i+=2) { //累加和与上题一样，只需把i++换成i+=2
			sum = sum + i;              //即为奇数相加  
		}
		System.out.println(sum);
		
	}
	
	
//	第十二题：求Sn=a+aa+aaa+……+aa……a之值,其中a是一个数字,n由键盘输入
	public static void t12(int a){
		Scanner scanner = new Scanner(System.in);//键盘输入
		System.out.println("请输入n:");
		int n = scanner.nextInt();  //输入的数用n接收
		int sum = 0;
		int b = 0;
		for (int i = 1; i <= n; i++) {
			
			b = b * 10 + a; //b用于储存每次变化后的值，前一个数乘10再加a
			sum = sum + b;  //sum累加
		}
		System.out.println(sum);
		
	}
	
	
//	第十三题：判断一个数是否为质数
	public static void t13(int n){
		  //用flag标记，默认设个true
		if (n < 2) {
			System.out.println(n + "不是质数");
		}else{
			boolean flag = false;//用flag标记，默认设个false
			for (int i = 2; i < n; i++) {
				
				if (n % i != 0) {   //输入的数和到n-1为止的每个数求余，若不等于0则为质数
					flag = true;    //质数时标记一下为false，后面就可以用false和true
					break;          //来区分质数，break跳出循环，一定不能在这写else，例如9%2！=0，但
				}                   //9%3=0,else的话就会出错，9就会if和else都满足
			}                       //所以要注意
			if (flag) {
				System.out.println(n + "不是质数");
			}                        
			else{
				System.out.println(n + "是质数");
			}
		}
		
	}
	
	
//	第十五题：求两个数的最大公约数
	public static int t14(int a, int b){
		int max = 0;  //定义一个量放最大公约数
		for (int i = 1; i <= b; i++) {
			if (a % i == 0 && b % i == 0) {//两个数都分别与i求余都等于0,
					max = i;               //i为两个数的公约数
			}
		}
		return max;
		
	}
	
	
//	第十四题：求两个正整数的最小公倍数
	public static int t15(int a1, int b1){
		return (a1*b1)/(t14(a1,b1));  //用a1*b1再除以上题的方法，上题参数换成
		                              //a1和b1，两数之积除以它们的最大公约数
	}                                 //为它们的最小公倍数
	
	
//	第十六题：小球落下反弹问题
	public static void t16(){
		
		double zh = 100; //定义一个总高度，初始值先设为刚开始的高度100
		double fh = 50;  //定义反弹高度，初始值为刚开始高度的一般
		int count = 1;   //计次数
		while (fh >= 0.1) { //反弹高度大等于0.1时进去计算
			zh = zh + 2*fh;  //累加
			fh = fh / 2;
			count++;
			
		}
		System.out.println("在第"+count+"次之后反弹高度小于0.1米");
		System.out.println("这一次落地时共经过"+zh+"米");
	}
	
	
}
