package Restudy_java;
//ランダム
//二つの整数
//大きいほうの値を表示する
//if文を使う
public class Jouken_2B1 {
	public static void main(String[] args) {
		int random1 = new java.util.Random().nextInt(100);
		int random2 = new java.util.Random().nextInt(100);
		int num1 = random1;
		System.out.println("ランダムに生成された数字："+ num1);
		int num2 = random2;
		System.out.println("ランダムに生成された数字："+ num2);
		
		if (num1 == num2) {
			System.out.println("二つの数字は同じ数字です");
		}else if (num1 < num2) {
			System.out.println("大きい数字は" + num2);
		}else if (num1 > num2) {
				System.out.println("大きい数字は" + num1);
		}
		System.out.println("プログラム終了！");
	}
}
