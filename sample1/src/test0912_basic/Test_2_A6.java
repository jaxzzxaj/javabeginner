package test0912_basic;
//標準入力から性別（女性：１、男性：それ以外）
//及び日曜日（月：１～日：７）を入力し
//女性かつ水曜日ならば「チケットは１０００円です」
//情勢または水曜日どちらかならば「ちっけと」は1600円です。
//それ以外は「チケットは２０００円です」と表示するプログラムを作成せよ

//標準入力機能を導入①
import java.util.Scanner;
public class Test_2_A6 {
//	main()メソッドで箱を作る
	public static void main(String[] args) {
//標準入力機能を導入②
		Scanner s = new Scanner(System.in);
//	入力した整数を格納する箱を作成する(性別と曜日）
//	相手にタイプしてほしいことを伝える（性別）
		System.out.println("整数を入力してください。女性なら１、男性なら１以外です。");
		int sex = s.nextInt();
//	相手にタイプしてほしいことを伝える（曜日）
		System.out.println("整数を入力してください。日=1,月=2,火=3,水=4,木=5,金=6,土=7です。");
		int day = s.nextInt();
//	条件分岐を使って1000円と1600円と2000円の命令式を書く
		if(sex == 1 && day == 4){
			System.out.println("チケットは1000円です。");
		}else if (sex == 1 || day == 4) {
			System.out.println("チケットは1600円です。");		
		}else{
			System.out.println("チケットは2000円です。");
		}
		System.out.println("プログラム終了です！");
//		sをクローズさせる
		s.close();
	}	
}
