package Restudy_java;
//標準入力
//西暦（整数）を入力
//①条件：４で割り切れる＝咲く
//②条件：４で割り切れるbut１００で割り切れる＝咲かない
//③条件：②but４００で割り切れば咲く

import java.util.Scanner;

public class Jouken_2B3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int years = s.nextInt();
		
		
		 if (years % 400 == 0) {
	            System.out.println("満開に咲く");
	        } else if (years % 100 == 0) {
	            System.out.println("咲かない");
	        } else if (years % 4 == 0) {
	            System.out.println("お花が咲く");
	        } else {
	            System.out.println("咲くことはない");
		s.close();
	        }
	}
}
