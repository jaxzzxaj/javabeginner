package Restudy_java;

import java.util.Scanner;

//標準入力
//条件：１～１２までの数字を入力
//偶数＝偶数月です
//奇数＝奇数月です
//範囲外＝範囲外です
public class Jouken_2B2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
				System.out.println("１～１２の数字を入力してください");
				int num = s.nextInt();
		if((num % 2) == 0 && num <= 12) {
			System.out.println("偶数月です");
		}else if ((num % 2) == 1 && num <= 12) {
			System.out.println("奇数月です");
		}else {
			System.out.println("範囲外です");
		}
		s.close();
	}
}
