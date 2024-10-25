package test0912_basic;

//標準入力から１つの整数を入力し、値が１ならば「赤」
//２ならば、「黄」、それ以外ならば「青」と表示する
//プログラムを作成せよ
//Scannerを導入①
import java.util.Scanner;

public class Test_2_A2 {

	public static void main(String[] args) {
//	出力機能を追加
//	Scannerを導入②
		System.out.println("１を入力すると「赤」、２を入力すると「黄」、それ以外ならば「青」になります。");
		Scanner s = new Scanner(System.in);
		int color = s.nextInt();

		
		if (color == 1) {
			System.out.println("赤"); 
			}else if(color == 2) {
				System.out.println("黄");
				
			} else {
					System.out.println("青");
				}
		s.close();
					
				}
			
			
		
	}


