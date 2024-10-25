package test0912_basic;
//整数の変数を２つ宣言し、+-*/%を表示するプログラムを作成せよ。
public class Test_1_A1 {
//	Main（）メソッドで箱を作成
	public static void main(String[] args) {
		int a = 10;
		int b = 22;
		
//		+の場合
		int calc = a + b ;
//		-の場合
		int calc2 = a - b ;
//		＊の場合
		int calc3 = a * b ;
//		/の場合
		int calc4 = a / b ;
//		％の場合
		int calc5 = a % b ;
		
		System.out.println(calc);
		System.out.println(calc2);
		System.out.println(calc3);
		System.out.println(calc4);
		System.out.println(calc5);
	}
}
