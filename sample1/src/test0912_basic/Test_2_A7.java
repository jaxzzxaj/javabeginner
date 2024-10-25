package test0912_basic;
//標準入力から整数を入力し、値が1ならば「赤」、
//２ならば「黄」、３ならば「青」と標準するプログラムを、
//switch文利用して作成せよ。

//標準入力機能を導入①
import java.util.Scanner;
public class Test_2_A7 {
//	Main（）メソッドを使って箱を作る
	public static void main(String[] args) {
//	入力させたいことを伝える
		System.out.println("１～３の数字を入力してください");
//	標準入力機能を導入②
		Scanner s = new Scanner(System.in);
//　数字を格納する箱を作る
		int color = s.nextInt();
//	switch文を使って、１～３とそれ以外の出力結果を作る。
	switch(color) {
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
		System.out.println("１～３の数字でお願いします");
		}
//	sをクローズさせる
	s.close();
	}
}
