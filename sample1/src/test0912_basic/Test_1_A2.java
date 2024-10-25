package test0912_basic;
//２つの整数を文字列で宣言し、その文字列を数値に変換して+-*/%せよ。
public class Test_1_A2 {
//Main（）メソッドで箱を作る
	public static void main(String [] args) {
//	２つの整数を文字列で宣言
		String strnum1 = "10";
		String strnum2 = "330";
//		文字列を数字に変換
		int change_to_num1 = Integer.parseInt(strnum1);
		int change_to_num2 = Integer.parseInt(strnum2);
//		+の場合
		int answer1 = change_to_num1 + change_to_num2;
//		-の場合
		int answer2 = change_to_num1 - change_to_num2;
//		*の場合
		int answer3 = change_to_num1 * change_to_num2;
//		/の場合
		int answer4 = change_to_num1 / change_to_num2;
//		%の場合
		int answer5 = change_to_num1 % change_to_num2;
//		すべての解を出力する
		System.out.println("10+330の和＝"+answer1);
		System.out.println("10-330の差＝"+answer2);
		System.out.println("10*330の積＝"+answer3);
		System.out.println("10/330の商＝"+answer4);
		System.out.println("10/330の余り＝"+answer5);
	}
}
