package test0912_basic;

public class Test_6_A1 {
	public static void main(String[]arges) {
		profile("鈴木",20,55.5);
		profile("山田",45,65.8);
		profile("佐藤",30,46.1);	
	}
		public static void profile(String name, int age, double weight){
			System.out.println(name + "さんは" + age + "歳、体重は" + weight  + "kgです。" );
		}
}
