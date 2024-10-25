package test0912_basic;
//ランダムで２つの整数を表示し、大きいほうの値を表示する
//プログラムをif文を利用して作成せよ
public class Test_2_B1 {
//	Main（）メソッドで箱を作成
	public static void main(String [] args) {
//	ランダムで整数を表示するシステムを作る
//	二つの整数を格納する箱を作成
		int num1 = new java.util.Random().nextInt();
		System.out.println("一個目の数字は：" + num1);
		int num2 = new java.util.Random().nextInt();
		System.out.println("二個目の数字は" + num2);
//	ifで大きいほうの数字を求める式と出力する機能追加
		if( num1 < num2 ) {
			System.out.println("大きいほうは" + num2);
		}else if(num1 > num2) {
			System.out.println("大きいほうは" + num1);			
		}else if(num1 == num2) {
			System.out.println("二つの数字は同じ数字です");
		}
		System.out.println("\n\nプログラムを終了します");
	}
}
