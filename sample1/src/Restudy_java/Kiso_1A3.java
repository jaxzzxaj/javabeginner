package Restudy_java;
//標準入力機能の導入
import java.util.Scanner;
//クラスを指定
public class Kiso_1A3 {
//	Main（）メソッドで箱を作る
	public static void main(String[]args) {
//		標準入力機能を導入
		Scanner s = new Scanner(System.in);
//		ユーザが入力した整数を変数（箱）に入れる
		double i1 = s.nextInt();
		double i2 = s.nextInt();
//		出力させる
		System.out.println("最初に入力して数字は" + i1);
		System.out.println("最後に入力して数字は" + i2);
//		sをクローズさせる
		s.close();
		
		
		
		
		
	}
}
