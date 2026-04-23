package jp.co.aforce.sample;

import java.util.Scanner;

public class do_while_3 {
	public static void main(String[] args) {
		int j = 0;
		Scanner numbers = new Scanner(System.in);
		do {
			System.out.println("数字");
			int num = numbers.nextInt();
			if (num != 0) {
				j = j + num;
			} else {
				break;
			}
		} while (true);
		System.out.println(j);
	}
}
