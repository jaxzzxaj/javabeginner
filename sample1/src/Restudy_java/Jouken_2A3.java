package Restudy_java;

import java.util.Scanner;

//標準入力から
//二つの整数を入力し
//大きいほうの値が表示する
//ただしifを利用すること
public class Jouken_2A3 {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
//		int bigger = Math.max(num1, num2);
		
		if(num1 < num2) {
		 System.out.println(num2 +"のほうが大きいです");	
		}else if(num1 > num2){
			System.out.println( num1 +"のほうが大きいです");
		}else {
			System.out.println("同じ数字です");
		}
		s.close();
	}
}
