package Restudy_java;
//標準入力から
//一つの整数を入力し
//値が１＝赤
//それ以外なら青
import java.util.Scanner;
public class Jouken_2A1 {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		if(num == 1 ) {
			System.out.println("赤");
		}else {
			System.out.println("青");
			s.close();
		}
	}
}
