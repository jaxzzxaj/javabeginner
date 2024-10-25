package sample1;

import java.util.Scanner;

//クラス名を示す
public class sample6 {
//	main()メソッドという箱を作る
	public static void main(String[] args) {
//		箱sの中にコンソールを追加
		Scanner s = new Scanner(System.in);
		String str = s.next();
		
		System.out.print(str);
		s.close();
	}

}
