package Restudy_java;
//1-10までの値
//加算する
//条件：for/while/do-while
//表示
public class Again_3A3 {
	public static void main(String[] args) {
	int i = 0;
	int answer =0;
//	for
	for(i =0; i < 11; i++) {
//		どうして 上の変数を消したあと、forの箱の中に同じ変数をおいてはだめなんだろうか？
		answer += i;
		System.out.println("（for）1-10までを加算した結果：" + answer);
	}

//	while
	i = 0;
	answer =0;
	while(i < 11) {
		answer += i;
		System.out.println("(while)1-10までを加算した結果：" + answer);
		i++;
	}
		
//	do-while
	i = 0;
	answer = 0;
	do {
		answer += i;
		System.out.println("(do-while)1-10までを加算した結果：" + answer);
		i++;
	}while(i < 11);
}
}