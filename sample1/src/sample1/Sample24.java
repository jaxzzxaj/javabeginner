package sample1;
//クラス名を指定：二次元配列の練習
public class Sample24 {
//Main（）メソッドで箱を作成
	public static void main(String[] args) {
//	二次元配列（たくさんある箱×たくさんある箱）の設定。
//　二次配列の宣言。
	int[][] grades;
	grades = new int[3][2];
	
	grades[0][0] = 1;
	grades[0][1] = 2;	
	grades[0][2] = 3;
	grades[1][0] = 4;	
	grades[1][1] = 5;
	grades[1][2] = 6;	
	grades[3][0] = 7;
	grades[3][1] = 8;	
	grades[3][2] = 9;
	
	System.out.println(grades[3][2]);
	

//二次元配列の要素を利用	(これでも二次元配列の宣言できている)
	
	int[][] gradess = {{ 80, 99, 100, 88, 60},
						{ 100, 100, 100, 20, 100},
						{25, 80, 40, 50, 33}
						};	
//	二次元配列のlengthを指定して数字を出力する
	System.out.println((gradess[0][0] + gradess[0][1]));
	System.out.println(gradess[1][0]);
	System.out.println(gradess[2][0]);	
	
}
}
