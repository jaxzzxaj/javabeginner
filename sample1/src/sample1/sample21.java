package sample1;
//クラス名：配列の練習
public class sample21 {
//Mainメソッド（）で箱を作成
	public static void main(String[] args) {
//配列（たくさんある箱）の設定
	int[] nums = new int[3];
//要素の代入
	nums[0] = 10;
	nums[1] = 100;
	nums[2] = 1000;
//	new int[3]とは、intという配列（多数の箱）は３こまでしか作れないという意味？
	nums[3] = 10000;
	
//	出力機能を作成
	System.out.println(nums[0]);
	System.out.println(nums[1]);
	System.out.println(nums[2]);
//	配列の実験：new int[3]の意味を調べたい。
	System.out.println(nums[3]);
	
	}
}
