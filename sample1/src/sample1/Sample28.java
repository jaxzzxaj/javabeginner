package sample1;
//クラス名の指定：戻り値の実験
public class Sample28 {
//main（）メソッドで箱を作る
	public static void main(String[] args) {
//	単語が入る箱を二つ作る
		double a = 12.2;
		double b = 7.7;
//	文字列を数字に変換する
		int change = (int)a;
		int fix = (int)b;
//二つの数字をaddメソッドの箱に入れる
		int result = add(change, fix);
//試しに箱の中身を少なくした場合はどうなるか(だめだった）
//		int result = add(change);		
//試しに同じものを入れた場合どうなるか	（大丈夫だった）	
//		int result = add(change, change);
//	試しに同じ箱の名前の場合はどうなるか
		int x = add(change, change);
		System.out.println("値は"+ result + "です");
		System.out.println("値は" + x + "です");
				
	}
//	add()メソッドを使って箱を指定する
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
}
