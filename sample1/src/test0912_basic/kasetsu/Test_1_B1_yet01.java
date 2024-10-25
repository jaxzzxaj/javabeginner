package test0912_basic.kasetsu;
//標準入力から4桁の整数を入力し、各桁の数字を表示するプログラムを作成せよ
//標準入力機能の導入①
import java.util.Scanner;
public class Test_1_B1_yet01 {
//	Main()メソッドで箱を作る
	public static void main(String[] args) {
//	ユーザに４桁の数字を入力させる
		System.out.println("４桁の数字を入力してください");
//	標準入力機能の導入②
		Scanner s = new Scanner(System.in);
//	入力した数字を格納する箱を作る
		int four_numbers = s.nextInt();
//	数字（整数）を４桁に制限をかける
		do {
			System.out.println("入力した数字（整数）は4桁にしてください");
		}while (1000 > four_numbers && four_numbers >= 10000 );
//		sをクローズさせる
		s.close();
	}
}
