package test0912_basic;

public class Test_3_A1_s {
	public static void main(String[] args) {
//		for
		int num = 0;
		for (int i = 0; i <5; i++) {
			num += 3;
			System.out.println("forの場合＝" + num);
		}
		
//		while
		num = 0;
		int i = 1;
		while(i <= 5) {
			num += 3;
			++i;
			System.out.println("whileの場合＝" + num);
		}
//		do-while
		i = 0;
		num = 0;
		do {
			num += 3;
			++i;
		}while(i < 5);
		System.out.println(num);
	}
}
		
			

