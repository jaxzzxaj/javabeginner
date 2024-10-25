package repractice_KISO;
//クラス名の指定
public class AB_All_about_detagata {
//Main（）メソッドで箱を作る
	public static void main(String[] args) {
//整数の箱(枠は必要ない)
		int i = 100;
//小数点の箱（枠は必要ない）		
		double d = 11.1;
//文字列の箱（ダブルクォーテーション）
		String str = "あいう";
//文字の箱（シングルクオーテーション）
		char c = 'Z';
//文字列や数字の結合
		String str1 = str + c + c + i + d;
		String str2 = str + c + c +( i + d);
//	すべて文字列として計算している
		System.out.println(str1);
//	()内の数字は一度計算してから文字列として変換している
		System.out.println(str2);
	}

}
