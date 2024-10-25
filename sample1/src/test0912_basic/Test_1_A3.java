package test0912_basic;

import java.util.Scanner;

//標準入力から整数２つを入力し、その平均値（少数）を表示するプログラムを作成せよ。
public class Test_1_A3 {
//Main（）メソッドで箱を作成
	public static void main(String[]arges) {
//	標準入力機能の説明を設定
		System.out.println("整数を入力してください：");
//　標準入力機能を追加
		
		Scanner s = new Scanner(System.in);
//	整数２つ入力する
		System.out.println("一つ目＝");
		int num1 = s.nextInt();
		System.out.println("二つ目＝");
		int num2 = s.nextInt();
//	標準入力をした数字を小数点に変換
		Double d = (double)(num1 + num2 )/ 2;
//出力機能の追加
		System.out.println("平均＝" + d);
//	"s"をクローズさせる
		s.close();
}
}