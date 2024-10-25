package test0912_basic.kasetsu;

public class Test_1_B2_kasetu {
//	Main（）メソッドで箱を作る
	public static void main(String[] args) {
//	できなかった！！
		int pick = new java.util.Random().nextInt();
		int i = 0;
		do {
			System.out.println(pick);
			++i;
//	二回まで生成させる
		} while (i < 2);
//	配列の中大きいほうを選ぶ（”解決墨である必要がある”→配列ではない）
//		int bigger = Math.max(pick[0], pick[1]);
//		System.out.println(bigger);
		
		
//	試しに！こっちもできない！配列に入ってない！？
//		System.out.println(pick[0]);
	}
	}


