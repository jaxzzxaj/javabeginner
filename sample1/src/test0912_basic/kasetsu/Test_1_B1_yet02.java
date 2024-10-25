package test0912_basic.kasetsu;
//標準入力から4桁の整数を入力し、各桁の数字を表示するプログラムを作成せよ
//標準入力機能の導入①
import java.util.Scanner;
public class Test_1_B1_yet02 {
//Main（）メソッドで箱を作る
	public static void main(String[] args) {
//	ユーザに４桁の数字を入力させたい
	System.out.println("４桁の数字を入力してください：");
//	標準入力機能の導入②
		Scanner s = new Scanner(System.in);
//		Scanner sc = new Scanner(System.in);
//数字（整数）を格納する箱を作る
		int four_num = s.nextInt();{
//	入力する整数を４桁に制限をかける
			if( (1111 <= four_num && four_num <=9999) ) {
//	条件がtrueの時の出力結果をつくる
				System.out.println("入力した４桁の数字（整数）は"  + four_num);
//　条件外の場合は４桁の注意をつくる
			}while(1000 > four_num || four_num >9999){
				System.out.println("４桁の数字以外は受け付けません。もう一度入力して下さい");
//	無限ループ発生！！
				
				
				
				
//	ｓをクローズさせる
				s.close();
				}
				
			}
			
		}
	}
