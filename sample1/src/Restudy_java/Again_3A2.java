package Restudy_java;

import java.util.Scanner;

//標準入力
//こんにちはと入力
//５回繰り返して表示させる
//for,while,do-whileを使う
public class Again_3A2 {
	public static void main(String [] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("こんにちはと入力してください：");
	
	String str = s.nextLine();
	s.close();
	
//	for文
	int i = 0;
	for(i = 0; i < 5 ; i++) {
		System.out.println("forの時"+ str);
	}
//	while文
	i = 0;
	while(i < 5) {
		System.out.println("whileの時"+str);
		i++;
	}
//	do-while文
	i = 0;
	do {
		System.out.println("do-whileの時" + str);
		i++;
	}while(i < 5);
	}
	
}
