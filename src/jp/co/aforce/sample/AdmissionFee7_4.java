package jp.co.aforce.sample;

import java.util.Scanner;

public class AdmissionFee7_4 {
	public static void main(String[] args) {
		Scanner Number = new Scanner(System.in);
		System.out.println("年齢を入力");
		int age = Number.nextInt();
		if (age >= 0 && age <= 12) {
			System.out.println("無料");
		} else if (age >= 13 && age < 60) {
			System.out.println("1000円");
		} else {
			System.out.println("500円");
		}
	}
}