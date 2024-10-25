package test0912_basic;

public class Test_6_A2 {
	public static void main(String[] args) {
//	二つの整数が入った引数（箱）をつくる
	int num1 =333, num2 = 43;
//	averrageというdouble型の箱にさきほどの引数を入れた箱を配置
	double averrage = calculateAverage(num1, num2);
//	double averrage1 = calculateAverage(num1.num1, num2); 
	System.out.println("平均値は"+ averrage);
	}
//	二つの整数の平均値を求めるメソッド
//さきほど未定義だったcalculateAverageの箱の中身を設定
	static double calculateAverage(int n1, int n2) {
		double averrage = (double)(n1 + n2)/2;
//		double averrage1 = (double)(n1 + n2)/2;
//	calculateAverageの結果を同じ
		return averrage;
//		return averrage1;
	}
}