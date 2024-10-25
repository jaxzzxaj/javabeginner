package repractice_KISO;

//クラスの指定
public class AD_All_about_cast {
	//Main（）メソッドで箱を作る
	public static void main(String[] args) {
		//数字や文字列の箱を設定
		String str = "10";
		String str2 = "2.34";
		char ch = 'Q';
		int num = 100;
		double d = 5.55;
		//double>float>long>int>short=char>byteが箱の大きさ
		//大きい箱を小さくする方法
		int num2 = (int) d;
		System.out.println(num2);

		//なぜ文字を変換すると数字になって、整数は数字になる？
		//	unsigned char型・文字コードが割り当てられている(ASCIIコード表というらしい)
		byte num3 = (byte) ch;
		System.out.println(num3);

		//	文字列を整数や小数点にする方法(返還後の中身は箱と形状と同じでなければならない)
		int change = Integer.parseInt(str);
		System.out.println(change * change);

		double change2 = Double.parseDouble(str2);
		System.out.print(change2 + change2);
		//	数字を文字列に変換する方法（Stringの場合は形状関係なく文字列になる）
		String change3 = String.valueOf(num);
		String change4 = String.valueOf(d);
		System.out.println(change3 + "\t" + change4);
	}

}
