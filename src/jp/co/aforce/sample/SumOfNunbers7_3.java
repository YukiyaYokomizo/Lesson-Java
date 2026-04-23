package jp.co.aforce.sample;

import java.util.Scanner;

public class SumOfNunbers7_3 {
	public static void main(String[] args) {
		int j = 0;
		while (true) {
			Scanner Numbers = new Scanner(System.in);
			System.out.println("数字を入力してください");
			int num = Numbers.nextInt();
			if (num != 0) {
				j = j + num;
			} else {
				break;
			}
		}
		System.out.println(j);
	}
}

//好きな問題