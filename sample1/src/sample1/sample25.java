package sample1;
//クラス名を指定：メソッドの呼び出しの練習（controllerのprivateに似てる）
public class sample25 {
//Main()メソッドで箱作る
	public static void main(String[] args) {
//出力機能を作成
		System.out.println("heelooo");
//	メソッドを呼び起こす
		method();
		System.out.println("メソッドの呼び出し完了");
	}
//	メソッドの中身(コードの読み込みは基本的には上から順に読み込む)
	public static void method() {

	System.out.println("my name is method!");
	}
}
