package repractice_KISO;
//戻り値の練習
public class AG_All_about_modorichi {

	public static void main(String[] args) {
//上は基本的に引数、戻る場所、結果
		int x = 100;
		int y = 1000;
//		戻る場所を指定①
		int result = add(x,y);
//		結果を出力する設定　
		System.out.println("値は＝" + result + "です");
	}
//	戻る場所の型に合わせた箱を作る
	public static int add(int a1, int a2) {
//	受け取った値（:key)を使って計算/命令式を書く
		int formular = a1 + a2;
//	result先に結果を残す②
		return formular;
	}

}
