package Restudy_java;
//標準入力から
//性別（女性：１，男性：それ以外）
//曜日（月火水木金土日：１２３４５６７）
//条件：女性＋水曜日＝チケット１０００円
//条件：女性or水曜日＝チケット1600円
//条件：それ以外＝２０００円
//表示

import java.util.Scanner;
public class Jouken_2A6 {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("性別を入力せよ（女性なら１、男性ならそれ以外）：");
		int person = s.nextInt();
		
		if (person == 1 ) {
			System.out.println("あなたの性別は：女性");
		}else {
			System.out.println("あなたの性別は：男性");
		}
		
		System.out.println("希望の曜日を選択してください（月火水木金土日：１２３４５６７）");
		int date = s.nextInt();
		
		if (date == 1) {
			System.out.println("月")	;
		} else if (date == 2) {
			System.out.println("火");
		} else if (date == 3) {
			System.out.println("水");
		} else if (date == 4) {
			System.out.println("木");
		} else if (date == 5) {
			System.out.println("金");
		} else if (date == 6) {
			System.out.println("土");
		} else if (date == 7) {
			System.out.println("日");
		}
//		条件分岐
		if (person == 1 && date == 3) {
			System.out.println("チケットは１０００円です")	;
		}else if (person == 1 || date == 3) {
			System.out.println("チケットは１６００円です");
		}else {
			System.out.println("チケットは２０００円です");
		}
		s.close();
		}
	}
