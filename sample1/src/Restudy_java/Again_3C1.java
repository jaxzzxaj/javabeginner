package Restudy_java;
//アスタリスクを使う
//三角形（頂点が上と下）を表示
public class Again_3C1 {
	public static void main(String[] args) {
		int max = 5;
		String star = "*";
//	①頂点が上の時
		for (int i = 0; i < max; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(star);
			}
			System.out.println("\n");
		}
//	②頂点が下の時
		for (int i =0; i < max; i++) {
			for (int j = 4; j >=i; j--) {
				System.out.print(star);
			}
			System.out.println("");
			
		}
//	③試しに①の鏡
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < max-i; j++) {
				System.out.print("");
			}
			for (int k = 0; k <=i; k++) {
				System.out.print(star);
			}
			System.out.println("\n");
		}
//	④試しに③の鏡
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < max-i; j++) {
				System.out.print("");
			}
			for( int k = 0; k <=i; k++) {
				System.out.print(star);
			}
			System.out.println("\n");
		}
	}
	
}
