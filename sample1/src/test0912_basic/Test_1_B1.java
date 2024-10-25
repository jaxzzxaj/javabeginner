package test0912_basic;

//標準入力から4桁の整数を入力し、各桁の数字を表示するプログラムを作成せよ
//標準入力を導入①
import java.util.Scanner;

public class Test_1_B1 {
	//	Main（）メソッドで箱を作る
	public static void main(String[] args) {
		//	出力機能の作成
		System.out.println("４桁の数字を入力してください");
		//	標準入力を導入②
		Scanner s = new Scanner(System.in);
		//	入力された整数を変数の中へ
		int i = s.nextInt();
		{
			//	４桁になるように制限を
			if (i < 9999 && 1000 <= i) {
				//千の位の桁を計算
				int thousand = (i / 1000);
				//		百の位の桁を計算
				int hundred = (i % 1000) / 100;
				//		十の位の桁を計算
				int ten = (i % 100) / 10;
				//		一の位の桁を計算
				int one = (i % 10);

				System.out.println("千の位が" + thousand + "\n\n百の位が" + hundred + "\n\n十の位が" + ten + "\n\n一の位が" + one);
			} else {
				System.out.println("４桁のみしか処理できません。");
			}
			//sをクローズさせる
			s.close();
		}
	}
}
