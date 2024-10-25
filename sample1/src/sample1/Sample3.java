package sample1;

import java.util.Scanner;

public class Sample3 {
//	箱の用意
	public static void main(String[] args) {
//		箱の中身（命令）
	Scanner s = new Scanner(System.in);
	Double d = s.nextDouble();
	
	System.out.println(d);
//	もしsが閉じられることはありませんと表示されたら下記を最後に記述。（ｗｈｙ＝null)
	s.close();
	}

}
