package test0912_basic;
//標準入力から２つの整数を入力し、大きいほうの値を
//表示するプログラムを"if文"を利用して作成せよ。

//標準入力機能を作る①
import java.util.Scanner;

public class Test_2_A3 {
//Main（）メソッドを使って箱を作る
	public static void main(String[] args) {
//	標準入力機能を作る②
		Scanner s = new Scanner(System.in);
//	出力機能を作成
		System.out.println("整数を２つ入力して下さい");
//	整数を格納する箱を二つ作る
		int num1 = s.nextInt();
		int num2 = s.nextInt();
//	高い整数を選んでくれる命令式を書く(必要なし！）
//		int bigger = Math.max(num1, num2);
//	if文を使って条件分岐を作る
		if(num1 < num2) {
			System.out.println("大きいほうは" + num2);
		}else if(num1 > num2 ) {
			System.out.println("大きいほうは" + num1);
		}else if(num1 == num2 ) {
			System.out.println("入力した数字は同じです");
//	sをクローズする。
		s.close();
		}
		System.out.println("プログラム終了！");
		}
	}
