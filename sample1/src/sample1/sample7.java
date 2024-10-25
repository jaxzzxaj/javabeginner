package sample1;

//クラス名を指定
public class sample7 {
//	main()メソッドという箱を作成
	public static void main(String[] args) {
//		文字列版の箱
		String str = "10";
//		整数版の箱
		int i = 123;
//		小数点版の箱
		double d = 10.1;
		
		
//		文字列を整数に変換する命令式
		int ii = Integer.parseInt(str);
		
		System.out.println(ii+ii);
		
//		文字列を少数に変換する命令式
		double dd = Double.parseDouble(str);
		
		System.out.println(dd + dd + dd);
		
//		数字を文字列に変換する命令式
		String strstr = String.valueOf(i);
		
		System.out.print(strstr + strstr);
		
//		すべての箱を文字列に変換して一つの文章にする命令式(1012310.1)
		String word1 = String.valueOf(i);
		String word2 = String.valueOf(d);
		
		System.out.print(str + word1 + word2);
		
//		すべての箱を数字に変換して加算する命令式(143.1=10+10.1+123)
		int number1 = Integer.parseInt(str);
		
		
		System.out.println(number1 + d + i);
		
	}
}
