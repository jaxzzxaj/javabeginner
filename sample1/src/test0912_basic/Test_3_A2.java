package test0912_basic;

import java.util.Scanner;
public class Test_3_A2 {
	public static void main(String[] args) {
		System.out.println("こんにちはと入力してください");
			Scanner s =new Scanner(System.in);
			String str = s.nextLine();
			s.close();
			
//		for
		for (int i = 0; i <5; i++) {
			
			System.out.println("forの場合"+str);
		}
		
//		while
		int i = 0;
		while(i < 5) {
			++i;
			System.out.println( "whileの場合"+str);
		}
//		do-while
		i = 0;
		do {
			System.out.println("do-whileの場合"+ str);
			++i;
		}while(i < 5);
		System.out.print("");
	}
}
