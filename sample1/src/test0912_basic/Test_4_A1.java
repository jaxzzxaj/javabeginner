package test0912_basic;

public class Test_4_A1 {

	public static void main(String[] args) {
		int num = 0;
		for (int i = 1; i <= 100; ++i) {
			if (i % 2 ==0) {
				num += i;
			}
			System.out.println(num);
		}
	}

}
