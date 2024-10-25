package Restudy_java;
//クラスを指定する
import java.util.Scanner;
public class Kiso_1A4 {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		double d1 = s.nextInt();
		double answer = (d1 * 0.08)+d1;
		System.out.println("入力した整数の税込み金額（税率８％）="+answer +"円です");
		s.close();
	}
}
