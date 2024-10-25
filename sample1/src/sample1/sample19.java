package sample1;
//クラス名の指定：break文とcontinue文の練習
public class sample19 {
//	Mainメソッド（）で箱を作成
	public static void main(String[] args) {
//	初期条件を設定：for
		for (int i = 1; i <=5; i++) {
//条件の追加、追加した条件の処理文を設定
			if (i == 3) {
				break;
			}
			System.out.println(i);
		}
	}
}
