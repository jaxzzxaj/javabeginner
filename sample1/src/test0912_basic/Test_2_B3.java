//package test0912_basic;
////標準入力から西暦（整数）を入力し、下記の条件を持つ花が咲くかどうかを判定するシステムを作る。
////「年が4＝咲く、１００で割れる＝咲かない、４００で割れる＝咲く」
//
////標準入力を導入①
//import java.util.Scanner;
//public class Test_2_B3 {
////	Main（）メソッドで箱を作る
//		public static void main(String[] args) {
////	問いかける
//			System.out.println("西暦を入力せよ");
////		標準入力機能を導入②
//			Scanner s = new Scanner(System.in);
////			入力した西暦を格納する箱を作る。
//				int year = s.nextInt();
//				int num = year;
////				int bloom1 = (year/4);
////				System.out.println("4で割るとき"+bloom1);
////				int bloom2 = ((year/4)/100);
////				int bloom3 = (bloom2/400);
////				System.out.println("4で割った後100で割ったあとさらに400で割る時" + bloom3);
////				int close = ((year/4)/100);
////				System.out.println("4で割った後100で割ったとき" + close);
////				ifを使って条件分岐を作る
//					if(num/4) {
//						System.out.println("咲きました");
//					}else if (bloom3) {
//						System.out.println("咲いた");
//					}else if (close) {
//						System.out.println("咲かなかった");
//					}
//					System.out.println("プログラム終了");
//					s.close();
//		}
//
//}
