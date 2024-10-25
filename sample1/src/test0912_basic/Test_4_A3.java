package test0912_basic;
import java.util.Scanner;
public class Test_4_A3 {

	public static void main(String[] args) {
//		System.out.println("こんにちはとにゅうりょくしてください");
		Scanner s = new Scanner(System.in);

		while(true) {
			System.out.println("文字列を入力してください");
			String str = s.nextLine();
			
		if(str.equals("こんにちは")) {
			System.out.println("こんにちは！！！");
			break;
			
			}
		}
		s.close();
	}
}

