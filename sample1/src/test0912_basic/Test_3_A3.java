package test0912_basic;

public class Test_3_A3 {
	public static void main(String[] args) {
		int num = 1;
		for (int i =1; i <= 10; ++i) {
			num += i;
		}
		System.out.println(num);
		
		num = 1;
		int i = 1;
		while(i <= 10) {
			num +=i;
			++i;
		}
		System.out.println(num);
		
		num = 1;
		i =1;
		do {
			num +=i;
			++i;
		}while(i <= 10);
		System.out.println(num);
	}
}
