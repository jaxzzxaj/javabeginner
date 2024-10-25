package Restudy_java;
//整数５に５を加算
//それを１００になるまで
//何回繰り返したかを表示
public class Again＿3B1 {
	public static void main(String[] args) {
//		do-whileの場合
		int num =5;
		int i = 1;
		int answer = 0;
		
		do {
			answer =num * i;
			System.out.println("（do-while）"+ i + "回目" + "\n現在の合計は" + answer);
			i++;
		}while(!(answer == 100));
		
//		whileのみの場合
		answer = 0;
		i = 1;
		while(!(answer == 100)) {
			answer = i * num;
			System.out.println("while"+ i + "回目" + "\n現在の合計は" + answer);
			i++;
		}
		
//		forの場合
		i = 1;
		for(answer = 0; !(answer == 100); i++) {
			answer = i * num;
			System.out.println("for"+ i + "回目" + "\n現在の合計は" + answer);
		}
	}
}
