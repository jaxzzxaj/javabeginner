package Restudy_java;
//5の階乗
//条件：for/while/do-while
//表示
public class Again_3A5 {
	public static void main(String [] args) {
	int num = 5;
	
//forの場合
	for(int i = 1; i < 5; i++) {
		num *= i;
	}
	System.out.println("５の階乗の答え：" + num );
	
//whileの場合
	int i = 1;
	num = 5;
	while(i < 5) {
		num *=i;
		i++;
	}System.out.println("５を５回繰り返した結果：" + num);
//do-whileの場合
	i = 1;
	num = 5;
	do {
		num *=i;
		i++;
	}while(i < 5);
	System.out.println("5*1*2*3*4*5の結果：" + num);
}
}
