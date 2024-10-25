package Restudy_java;
//標準入力から
//点数（整数）を入力し
//８５以上ならば優
//７５以上なら良
//６０以上なら可
//６０以下なら不可
import java.util.Scanner;
public class Jouken_2A4 {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		if (num >= 85) {
			System.out.println("優");
		} else if (num < 85 && num >= 75) {
			System.out.println("良");
		} else if (num < 75 && num >= 60) {
			System.out.println("可");
		} else if (num < 60) {
			System.out.println("不可");
		}
		s.close();
	}

}
