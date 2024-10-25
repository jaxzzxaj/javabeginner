package repractice_KISO;

import java.util.Scanner;

//クラス名の指定
public class AC_All_about_hyoujun_nyuryoku {
	//Main（）メソッドで箱を作る
	public static void main(String[] args) {
		// 標準入力メソッドを追加する(next "i"の大文字)
		//	一回のみしか使えない　why;（）だから。
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		//	指定した条件内でランダムで代入してくれる
//		int random = new java.util.Random().nextInt(100);

		System.out.print(num);

		//	指定した条件内でランダムで代入してくれる
//		int in =new java.util.Random().nextInt(100);

		//なくてもいいがクローズする方法
		s.close();

		//配列にすることで何度も使えるはず
	}

}
