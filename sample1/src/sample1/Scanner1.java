package sample1;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		System.out.println(num);
		s.close();
	}

}
