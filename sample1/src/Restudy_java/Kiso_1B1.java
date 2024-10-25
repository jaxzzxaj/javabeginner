package Restudy_java;
//標準入力から
//４桁の整数を入力
//各桁の数字を表示するプログラムを作成する
import java.util.Scanner;
public class Kiso_1B1 {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int thousand = (num/1000);
		System.out.println(thousand);
		int hundred = (num/100)%10;
		System.out.println(hundred);	
		int ten = (num%100)/10;
		System.out.println(ten);	
		int one = num%10;
		System.out.println(one);	
		
		s.close();
		}
		
		
	}

