package jp.co.aforce.practice;

public class PracticeTest2 {
	public static void main(String[] args) {
		//3-1
		int TAX = 10;
		System.out.println(TAX + "%");

		//3-2
		int x = 480;
		double price = (double) x * (TAX / 100.0);
		System.out.println(price);

		//3-3
		String name = "Yukiya";
		System.out.println(name);
		
		//3-4
		String a = "この商品の値段は";
		String b = "円です";
		System.out.println(a + price + b);
	}
}
