package sample1;
//クラス名の指定
	public class sample10 {
	//main()メソッドの箱
	public static void main(String[] args) {
	//	数字を格納する変数を作成
		int i = 20;
		switch (i) {
			case 10:
				System.out.println("A：１０と一致したよー");
				break;
			case 20:
				System.out.println("B：２０と一致したよー");
				break;
			case 30:
				System.out.println("C：３０と一致したよー");
				break;
			
			default:System.out.println("D：どれにも一致しなかったよ。。");
				
//breakがなければ、結果がすべて出力されていた
		}
	}
}
