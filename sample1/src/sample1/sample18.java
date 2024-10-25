package sample1;
//クラス名の指定：繰り返しと条件分岐
public class sample18 {
//Mainメソッド（）で箱を生成
	public static void main(String[]args) {
//	初期条件式
		for(int i = 0; i < 5 ; i++) {
//	もし（if)iを２で割って＝０の場合、下記を出力してくださいという命令式。
			if (i % 2 == 0) {
				System.out.println( i  + "は偶数です");
			}
		}
	}
}
