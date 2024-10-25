package Restudy_java;
//ランダムで二つの整数
//表示
//大きいほうの値を表示する
//＊ifは使わない
public class Kiso_1B2 {
	public static void main (String[] args) {
		int random = new java.util.Random().nextInt();
		int random2 = new java.util.Random().nextInt();
		int i1 = random;
		System.out.println("ランダム生成１：" + random);
		int i2 = random2;
		System.out.println("ランダム生成２："+ random2);
		
		int bigger = Math.max(i1, i2);
		System.out.println("大きいほうの数字は" + bigger);
	}
}
