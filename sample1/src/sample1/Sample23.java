package sample1;
//クラス名を指定：配列の長さの練習
public class Sample23 {
//Main（）メソッドで箱を作る
	public static void main(String[] args) {
//	まず、配列（たくさんの箱）の中身を設定する。
		int[]nums = {10, 20, 30, 40, 50, 60, 70};
//	nums.lengthは配列の数字×→順番〇。i++も中身の数字ではなく順番〇。
		for (int i = 4; i <nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
