package Restudy_java;
//標準入力から
//一つの整数を入力し
//値が１ならば赤
//２ならば青
//それ以外なら黄
import java.util.Scanner;
public class Jouken_2A2 {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		if(num == 1) {
			System.out.println("赤");
		}else if (num == 2) {
			System.out.println("青");
		}else {
			System.out.println("黄");
		}
		s.close();
	}
}
