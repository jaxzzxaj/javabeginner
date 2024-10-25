package sample1;
//クラス名の指定
public class sample12 {
//main()メソッドで箱を作る
	public static void main(String[] args) {
//	整数が入っている箱を複数作る
		int a = 6;
		int b = 12;
//int c = 7; 引数は最大２つまでしかできないようだ
//大きいほうの数値を代入する命令
//引数は２個までなので下記はコメントアウト。
//		int x = Math.max(a, b, c);
		int x = Math.max(a, b);
		
		
		System.out.println("aのプリンの数は" + a + "bのプリンの数は" + b + "最も多い数は" + x + "です" );
		
		
	}
}