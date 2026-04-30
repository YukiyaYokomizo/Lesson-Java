package jp.co.aforce.sample;

import java.util.Scanner;

public class ExcptionTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("整数を入力してください: ");
		String input = scanner.nextLine();

		try {
			int number = Integer.parseInt(input);
			double result = number / 2.0;

			System.out.println("2で割った結果: " + result);

		} catch (NumberFormatException e) {
			System.out.println("整数ではありません。正しい整数を入力してください。");
		}

		scanner.close();

	}

}
