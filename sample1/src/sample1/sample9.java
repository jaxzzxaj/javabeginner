package sample1;
//クラス名を指定
public class sample9 {
//main()メソッドで箱を作る
	public static void main(String[]args) {
//		booleanの設定 true＝家事が完了、false=まだ終わっていない
		boolean isNoLaundry = true;
//		boolean isNoLaundry = false;
		boolean isNoclothers = true;
//		boolean isNoclothers = false;
		int num;
		
		if (isNoLaundry && isNoclothers) {
			num = 0;
			System.out.print("もう何もすることはない！ねよう！ｗ");
		}else if (isNoLaundry || isNoclothers) {
			num = 1;
			System.out.print("もうすぐで家事が終わる！！");
		}else {
			num = 2;
			System.out.print("家が洋服であふれている！！");
			
		}
	}
}
