package test0912_basic;
//標準入力から国語・数学・英語の３教科の点数（整数）を入力し、
//その合計点（整数）および平均点（少数）を表示せよ
//標準入力機能の導入①
import java.util.Scanner;
public class Test_1_A5 {
//Main()メソッドで箱を作る
	public static void main (String[] args) {
//	 標準入力機能の導入②
		Scanner s = new Scanner(System.in);
//		国語の点数を入力してくださいの設定
		System.out.println("国語の点数を入力してください：");
		int jap_point = s.nextInt();
//		数学数を入力してくださいの設定
		System.out.println("数学の点数を入力してください");
		int math_point = s.nextInt();
//		英語数を入力してくださいの設定
		System.out.println("英語の点数を入力してください");
		int eng_point= s.nextInt();
//		国語の点数を出力
		System.out.println("国語の点数は＝" + jap_point );
//		数学数を出力
		System.out.println("数学の点数は＝" +math_point);
//		英語数を出力
		System.out.println("数学の点数は＝" + eng_point );
//		合計点を出す命令式
		int total = (jap_point + math_point + eng_point );
//		平均点を出す命令式
		double avverage = (total)/3;
//		合計点と平均点を出す命令式
		System.out.println("合計点数は＝" + total);
		System.out.println("平均点（少数）＝" + avverage);
//		sをクローズさせる
		s.close();
		
//		
	}
	}