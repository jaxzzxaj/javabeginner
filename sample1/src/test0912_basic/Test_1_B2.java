package test0912_basic;
//ランダムで２つの整数を表示し、大きいほうの値を表示するプログラムを作成せよ（ifは禁止）
public class Test_1_B2 {
	//	Main（）メソッドで箱を作る
	public static void main(String[] args) {
		//	上限下限の条件なしで、ランダムな数を生成する。
//		int[] random = { new java.util.Random().nextInt(), new java.util.Random().nextInt() };
//		//	あれ？でも下のやり方だと格納する数の制限がない？
//		for (int i = 0; i < random.length; i++) {
//			int picks = Math.max(random[0], random[1]);
//			System.out.println(picks);
		int random1 = new java.util.Random().nextInt(10);
		int random2 = new java.util.Random().nextInt(10);
		
		int bigger = Math.max(random1, random2);
		System.out.println("一個目の数字は" + random1 + "二個目の数字は" + random2);
		System.out.println(bigger);
		}
	}