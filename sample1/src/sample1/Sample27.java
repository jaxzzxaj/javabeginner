package sample1;
//クラス名の指定：戻り値の練習
public class Sample27 {
//Main（）メソッドで箱を作る
	public static void main(String[]args) {
//足し算をするための箱を二つ作る
		int a = 10;
		int b = 20;
//	戻り値用のワープ（入口）場所を作る
		int result = add(a, b);
		
//	戻り値を使わず出力したい場合の命令式
//		int result = a+b;
//このあとから書いた式の答えをワープ入口へ戻す＝戻り値
		System.out.println("値は" + result + "です ");
	}
//	add（）メソッドで箱をつくらず、指定している
		public static int add(int num1, int num2) {
			int sum = num1 + num2;
			return sum;			
	}
}
