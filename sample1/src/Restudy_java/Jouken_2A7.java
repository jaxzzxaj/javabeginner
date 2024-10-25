package Restudy_java;

import java.util.Scanner;

//標準入力
//整数を１つ入力
//値が１＝赤
//２＝黄色
//３なら青
//条件：switchを使う

public class Jouken_2A7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("１～３の数字を入力してください");
		int num = s.nextInt();
		
		switch(num) {
		case(1):
			System.out.println("赤");
			break;
			
			case(2):
				System.out.println("黄");
			break;
			case(3):
				System.out.println("青");
			break;
			default:
				System.out.println("１～３以外は受け付けてません。");
			}
		s.close();
//		注意！case（）の後”：”だよ！！
	}
}