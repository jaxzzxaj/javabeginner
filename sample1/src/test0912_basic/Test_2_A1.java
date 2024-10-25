package test0912_basic;
//標準入力から一つの整数を入力し、値が１ならば「赤」、
//それ以外ならば「青」と表示するプログラムを作成せよ。
//Scannerの導入をする①
import java.util.Scanner;
public class Test_2_A1 {
//Main（）メソッドで箱を作成
	public static void main(String[] args) {
//	Scannerの導入をする②
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		
		if (num1 == 1){
			
			System.out.println("赤");
		} else {
			System.out.println("青");
//			sをクローズする
			s.close();
	}
}
}
