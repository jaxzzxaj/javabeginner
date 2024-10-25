package test0912_basic;
//標準入力から点数（整数）を入力し、85点以上ならば「優」
//75点以上ならば「良」、60点以上ならば「可」、６０点未満ならば
//「不可」を表示するプログラムを作成せよ。

//標準入力を導入せよ①
import java.util.Scanner;
public class Test_2_A4 {
//	Main()メソッドを使って箱をつくる
	public static void main(String[] args) {
//	ユーザに入力してほしい情報を伝える
		System.out.println("点数入力してください");
//		標準入力機能の導入②		
		Scanner s = new Scanner(System.in);
		int  point = s.nextInt();
//	点数によって変化するように条件分岐を作る
		if (85 <= point) {
			System.out.println("優");
		}else if(75 <= point && point < 85 ){
			System.out.println("良");
		}else if (60 <= point && point <= 75) {
			System.out.println("可");
		}else {
			System.out.println("不可");			
		}
		System.out.println("プログラム終了！");
//		sをクローズさせる
				s.close();

	}
}
