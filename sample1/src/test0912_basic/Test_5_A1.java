package test0912_basic;

public class Test_5_A1 {
	public static void main(String[] args) {
		
		int[] scores = {88,55,77,99,66};
		
		
//		scores[0] = 88;
//		scores[1] = 55;
//		scores[2] = 77;
//		scores[3] = 99;
//		scores[4] = 66;
		
		for(int i = 0; i < scores.length; ++i) {
			if (scores[i] > 70) {
			System.out.println(scores[i]);
		}		
	}
}
}