package sample1;
//	クラス名を指定
public class sample8 {
//	main()メソッドの箱
	public static void main(String[] args) {
//	天気＝晴れの箱を作成
		String weather ="台風";
//		条件分岐のもし（if(
		if (weather.equals("晴れ")) {
//		晴れになった場合の出力結果を設定
			System.out.println("外で干す");
		} else if(weather.equals("曇り")){
			System.out.println("様子を見る");
		}else if(weather.equals("雨")){
			System.out.println("部屋で干す");
		}else if(weather.equals("雪")){
			System.out.println("雪だるまを作る");
		}else {
			System.out.println("洗濯物を忘れて寝る!");
		}
//		その後の処理
		System.out.println("終了します");
				
	}

}
