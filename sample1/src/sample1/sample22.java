package sample1;
//クラス名の指定：初期化の省略方法
public class sample22 {
//Main（）メソッドで箱を作成
	public static void main(String[] args) {
//	配列（たくさんある箱）の中身を設定
		int[] nums = new int[] {10, 20,30};
//	ほかに int[] nums =(10, 20, 30);という方法もある。
//　すべての配列を加える
		int sum = nums[0] + nums[1] + nums[2];
//出力機能を作成して結果を見る。
		System.out.println(sum);
	}
}
