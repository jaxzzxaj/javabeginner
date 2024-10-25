package repractice_KISO;
//クラス名の指定
public class AE_All_about_if {
//Main（）メソッドで箱を作る
	public static void main(String[] args) {
//条件式の演算子の種類
//		int brother_age = 12;
//		int sister_age = 18;
		int mother_age = 40;
		int father_age = 36;
//	演算子の種類<,>,>-,<-,==,!=。!は条件を反転。＆＆二つの条件がtrueのみ。｜｜は少なくともどちらかがtrueのとき
		if( father_age < mother_age) {
			System.out.println("父は母より" + (mother_age % father_age) + "若いです");
//	elseの場合はfalseの返り値、else ifはほかの条件を指定して返り値はtrue、elseの場合はfalse。
		}else if ( father_age < mother_age) {
			System.out.println("母は父より" + (mother_age % father_age) + "大人です");
		}
		System.out.println("終了します");
	}

}
