package repractice_KISO;
//引数の練習
public class AF_All_about_hikisu {

	public static void main(String[] args) {
//	引数を設定
		profile("ポチ",7);
		profile("タマ",10);
	}
//	引数の中身の型を指定
//	railsでいうprivate、出力機能
	public static void profile(String name, int age) {
		System.out.println(name + "の年齢は" + age);
	}

}
