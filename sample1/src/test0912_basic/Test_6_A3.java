package test0912_basic;

public class Test_6_A3 {
	public static void main(String[] args) {
	
	int price =100;
	int costDown = (int)caluculatePrice(price); 
	System.out.println("割引された値＝" + costDown);	
}
	static double caluculatePrice(double n1) {
		double price = n1*0.7;
		return price;
	}
}