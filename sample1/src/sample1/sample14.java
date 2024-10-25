package sample1;
//クラス名の指定
public class sample14 {
//main()メソッドで箱を作成
	public static void main(String[] args) {
//変数（箱）の中に数字と小数点を設定
		int i = 4;
		double d = i;
//	出力システムの作成
		System.out.println("i=" + i);
		System.out.println("i=" + d);
//変数（箱）の中に数字をもう一回設定。
		int ii = 80;
		byte b =(byte)ii;
//	出力システムの作成
		System.out.println("ii=" + ii);
		System.out.println("ii=" + b);
		
		
		
		
//doubleの数値をintの変数に入れた場合の実験。
		double j = 10.111;
//このままintの箱に入れると怒られるので、箱の大きさを小さくする。
		int a = (int)j;
		System.out.println(a);
		
		
	}
}
