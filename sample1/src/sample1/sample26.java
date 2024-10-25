package sample1;
//クラス名の指定：メソッドで実験！
public class sample26 {
//Main（）メソッドで箱を作る。
	public static void main(String[] args) {
//	出力機能を設定①
		System.out.println("lets play with method()");
//	method 1（メソッド名はなんでもいい＋引数は値でも変数でも可能）
		breakfast("朝ごはん", "納豆ご飯");
		lunch("昼ごはん","ステーキ");
		dinner("夜ごはん","ホールケーキ");
		
		System.out.println("楽しかった！");		
	}
	
//	実験：methodの順番を変えず、Methodの箱の中身の順番を変えて
//	も処理の順番は変わらない。
	
	
	public static void dinner(String name, String food){
		System.out.println("奮発したから今日は" + name + "は" + food);
	}
	
//	変数breakfastの箱の命令式を書く。
	public static void breakfast(String name, String food) {
		System.out.println("私の" + name + "は" + food );
	}
//	変数lunchの箱の命令式を書く。
	public static void lunch(String name, String food){
		System.out.println("今日の" + name + "は" + food);
	}
//	変数dinnerの箱の命令式を書く。
//	public static void dinner(String name, String food){
//		System.out.println("奮発したから今日は" + name + "は" + food);
//	}
		
	}

