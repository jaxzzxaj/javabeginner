package Restudy_java;
//1-100までの整数
//偶数のみを集める
//合計を加算
//表示する
public class JoukenAgain_4A1 {
	public static void main(String[] args) {
	int num =0;
		
	for (int i =0; i < 100; i++) {
		if(i % 2 == 0) {
			num += i;
//		}else {
//			System.out.println("\n");
//		}
		System.out.println("偶数のみ加算した合計：" + num);
	}
}
	}
}