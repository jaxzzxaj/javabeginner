package test0912_basic;
//標準入力機能の追加準備
import java.util.Scanner;

//標準入力から値段（整数）を入力し、その税込み金額（税率8%）を整数で表示するプログラムを作成せよ。
public class Test_1_A4 {
//Mainメソッド（）で箱を作る
	public static void main(String[] args) {
//	標準入力機能の追加
	Scanner s = new Scanner(System.in);
//	数字を格納する箱をつくる
	int num1 = s.nextInt();
//	数字を税込み価格にする
	double d =(num1*0.08);
//	入力された数字を税込み金額(8%)にする
	double plus = (num1 * d  ) + num1;
//	出力機能をつくる
	System.out.println("入力された価格の税込み価格は" +"\n\n"+ plus + "です");
//sをクローズさせる
	s.close();
	}
}
