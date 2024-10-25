package test0912_basic;
//3を５回加算して結果を表示するプログラムをfor文
//while文、do-while文を使って作成せよ。
public class Test_3_A1 {
	public static void main(String[] args) {
//	forの場合
//		int sum = 0;
		for (int i = 1; i < 6; i++) {
			int answer1 = (3 * i);
			System.out.println("forの場合＝" + answer1);
		}
//	whileの場合
		int i = 1;
		while(i < 6) {
			int answer2 = (3 * i);
			System.out.println("whileの場合" +answer2);
			++i;
		}
//	do-whileの場合
		int answer3 = 0;
//		int answer3 = (answer * 3);
		do {
			int calc = (answer3 * 3);
			System.out.println("do-whileの場合" + calc);
			 ++answer3;
			
		}while(answer3 < 6);
		}
	}
