package test0912_basic;
import java.util.Scanner;
public class Test_4_A2 {

	public static void main(String[] args) {
		System.out.println("正の整数を５回入力してください");
		Scanner s = new Scanner(System.in);
		
//		int once = s.nextInt();
//		int second = s.nextInt();
//		int third = s.nextInt();
//		int fourth = s.nextInt();
//		int fifth = s.nextInt();
//		int biggest = Math.max(once, second,third,fourth,fifth);
		
		int max = 0;
		
		for (int i = 1; i <= 5; ++i) {
			System.out.println("正の整数を入力("+ i + "回目)");
			int num = s.nextInt();
			max =num;
		}
		System.out.println("最大値は" + max);
		s.close();
	}

}
