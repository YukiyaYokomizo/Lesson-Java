package jp.co.aforce.sample;

import java.util.Scanner;

public class EvenOrOdd7_1 {
	public static void main(String[] args) {
		Scanner Number = new Scanner(System.in);
		System.out.println("数字を入力");
		int num = Number.nextInt();
		if ( num%2 == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}
	}
}
