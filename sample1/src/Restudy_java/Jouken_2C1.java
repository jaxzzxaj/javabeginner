package Restudy_java;
//ユーザは標準入力
//コンピュータはランダム関数
//じゃんけんを一回行う
//０＝グー
//１＝チョキ
//２＝パー

import java.util.Scanner;

public class Jouken_2C1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ジャーンケーン（０：グー、１：チョキ、２：パー）");
		int user = s.nextInt();
		int cpu = new java.util.Random().nextInt(3);
		
//		あなた：グーver
		if (user == 0 && cpu == 0 ) {
			System.out.println("あなた：グー、CPU：グー。あいこ");
		}else if (user == 0 && cpu == 1) {
			System.out.println("あなた：グー、CPU：チョキ。勝った！");
		} else if (user == 0 && cpu == 2) {		
			System.out.println("あなた：グー、CPU：パー。負け⤵");
			
//			あなた：チョキver
		}else if (user == 1 && cpu == 0 ) {
			System.out.println("あなた：チョキ、CPU：グー。負け⤵");
		}else if (user == 1 && cpu == 1) {
			System.out.println("あなた：チョキ、CPU：チョキ。あいこ");
		} else if (user == 1 && cpu == 2) {
			System.out.println("あなた：チョキ、CPU：パー。勝ち！");
			
//			あなた：パーver
		} else if (user == 2 && cpu == 0 ) {
			System.out.println("あなた：パー、CPU：グー。勝ち！");
		}else if (user == 2 && cpu == 1) {
			System.out.println("あなた：パー、CPU：チョキ。負け⤵");
		} else if (user == 2 && cpu == 2) {
			System.out.println("あなた：パー、CPU：パー。あいこ");
		}else {
			System.out.println("もうこのゲーム飽きたの？");	
		}
		System.out.println("");
		System.out.println("また遊ぼうね！");
		s.close();
	}

}
