package Restudy_java;
//標準入力
//性別（女性：１、男性：それ以外）
//及び曜日（月：１～日７）を入力
//条件：女性＋水曜日＝チケット１０００円
//それ以外はチケット＝２０００円
//表示
import java.util.Scanner;
public class Jouken_2A5 {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("性別を入力してください（女性：１、男性：それ以外）:");
		int person = s.nextInt();
		
		if (person == 1 ) {
			System.out.println("あなたの性別：女性");
		}else {
			System.out.println("あなたの性別：男性");
		}
		
		System.out.println("曜日を入力してください（月火水木金土日：1234567）;");
		int date = s.nextInt();
		
		if (date == 1 ) {
			System.out.println("あなたが入力した曜日：月曜日");
		}else if( date == 2) {
			System.out.println("あなたが入力した曜日：火曜日");
		}else if( date == 3) {
			System.out.println("あなたが入力した曜日：水曜日");
		}else if( date == 4) {
			System.out.println("あなたが入力した曜日：木曜日");
		}else if( date == 5) {
			System.out.println("あなたが入力した曜日：金曜日");
		}else if( date == 6) {
			System.out.println("あなたが入力した曜日：土曜日");
		}else if( date == 7) {
			System.out.println("あなたが入力した曜日：月曜日");
		}
		
	if (person == 1 && date == 3) {
		System.out.println("チケットの料金は1000円です");
	}else {
		System.out.println("チケットの料金は2000円です");
	}
		s.close();
	}
}
