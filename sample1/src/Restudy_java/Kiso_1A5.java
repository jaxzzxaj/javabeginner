package Restudy_java;
//標準入力から
//国語、数学、英語の３教科の点数（整数）を入力
//その合計点及び平均点を
//表示せよ
import java.util.Scanner;
public class Kiso_1A5 {
	public static void main(String [] args) {
	Scanner s = new Scanner(System.in);
	
	int jap = s.nextInt();
	System.out.println("国語の点数は＝" + jap);
	int math = s.nextInt();
	System.out.println("国語の点数は＝" + math);
	int eng = s.nextInt();
	System.out.println("国語の点数は＝" + eng);
	
	int averrage = (jap + math + eng)/3;
	System.out.println("三科目（国語、数学、英語）の平均点は"+ averrage + "です");
	
	s.close();
  }
}
