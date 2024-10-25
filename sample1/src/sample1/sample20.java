package sample1;
//クラス名を指定：無限ループの練習
public class sample20 {
//Mainメソッド（）で箱を設定
	public static void main(String[]args) {
//	初期条件を設定
		for (int b = 1; b <= 3; b++) {
//	条件を追加して、無限ループを作成してみる
		if (b == 2) {
			b--;
		}
	}
	}
}
