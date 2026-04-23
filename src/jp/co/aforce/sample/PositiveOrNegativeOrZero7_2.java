package jp.co.aforce.sample;

import java.util.Scanner;

public class PositiveOrNegativeOrZero7_2 {
	public static void main(String[] args) {
		Scanner Number = new Scanner(System.in);
		System.out.println("数字を入力");
		int num = Number.nextInt();
		if ( num > 0) {
			System.out.println("正の数");
		} else if ( num < 0 ) {
			System.out.println("負の数");
		} else {
			System.out.println("零");
		}
	}
}
