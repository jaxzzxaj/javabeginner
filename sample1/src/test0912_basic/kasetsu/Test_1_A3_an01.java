package test0912_basic.kasetsu;

import java.util.Scanner;

//実験：標準入力されたものを配列に格納して、平均値（小数点）にしてみる。
public class Test_1_A3_an01{
//Main（）メソッドで箱を作成
	public static void main(String[]arges) {
//　標準入力機能を追加
		Scanner s = new Scanner(System.in);
//	標準入力をした数字を配列に格納（２個まで）
		int[] numbers = new int[2];
//	標準入力機能の説明を設定
		System.out.println("整数を入力してください：");
//	条件をつける（lengthが０～２のとき）		
		for (int i = 0; i < 2; ++i) {
			numbers[i] = s.nextInt();
		}
//配列の中身の確認のための文章
		System.out.println("入力された数字は：");
//	配列の中身を一個ずつ確認するための命令式
		for ( int number : numbers) {
			System.out.println(number);
		}
//	配列に格納されている整数を加えるに変換
		int answer =(numbers[0] + numbers[1]);
//　答えを小数点にする
		double d = (double)answer;
//	　答えの平均点を出す
		double e = (d/2);
//	答えを出力する
		System.out.println(e);
//	"s"をクローズさせる
		s.close();
}
}