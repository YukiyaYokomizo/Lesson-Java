package jp.co.aforce.sample;

public class MultipleOfFiveOrNot {
	public static void main(String[] args) {
		int num = 15;
		if ( num % 5 == 0 ) {
			System.out.println("5の倍数");
		} else {
			System.out.println("5の倍数でない");
		}
	}
}
