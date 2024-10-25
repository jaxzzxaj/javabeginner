package Restudy_java;
//九九の表を表示せよ
public class Again_3B2 {
	public static void main(String[]args) {
		int answer = 0;
		
//		子要素(j)を９回繰り返したら、親要素(i)を一回繰り返す命令式
		for (int i = 1; i <= 9; i++) {	
			for (int j = 1; j <= 9; j++) {
				answer = i * j;
				System.out.print(answer);	
			}
//			改行をする
			System.out.println("");
		}
	}
}
