package Restudy_java;
//３を５回
//加算
//して結果を表示
//for while do～while文を使って作成せよ
public class Again_3A1 {
	public static void main(String[] args) {
		int num  = 0;
//		if文の場合
		for (int i = 0; i < 5; i++ ) {
			num += 3;
		}
		System.out.println("５回加算した結果："+ num);
//		while文の場合 
		int i = 0;
		num = 0;
		while( i < 5) {
			num += 3;
			i++;
		}
		System.out.println("5回加算した結果：" + num);
		
//		do-while文の場合
		num = 0;
		i = 0;
		do {
			num += 3;
			i++;
		}while(i < 5);
		System.out.println("５回加算した結果：" + num);
	}

}
