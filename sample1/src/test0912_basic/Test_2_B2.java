package test0912_basic;
//１～１２を標準入力から入力し、偶数ならば「偶数月です」
//奇数ならば「奇数月です」、範囲外ならば「範囲外です」と表示するプログラムを作成せよ。

//標準入力機能を導入①
import java.util.Scanner;
public class Test_2_B2 {
//	Main()メソッドで箱を作る
	public static void main(String[] args) {
//	相手に問いかける
		System.out.println("１～１２の数字を入力してください");
//　標準入力機能を導入②
		Scanner s = new Scanner(System.in);
//	入力した数字を格納する箱を作る
		int num = s.nextInt();
//　偶数か奇数かを導かせるための式を作成(結果が0=偶数、結果が１=奇数）
		int formular = (num % 2);
//　if文章を使って偶数か奇数か範囲外の出力結果を出す
//	上から順に処理するを利用して、まずは範囲外の命令式を書く
		if (num >= 13) {
			System.out.println("範囲外です");			
		}else if(formular == 0) {
			System.out.println("偶数月です");
		}else if (formular == 1){
			System.out.println("奇数月です");
		}
		System.out.println("プログラム終了です");
		s.close();
	}

}
