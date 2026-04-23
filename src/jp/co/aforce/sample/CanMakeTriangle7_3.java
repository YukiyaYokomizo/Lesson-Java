package jp.co.aforce.sample;

import java.util.Scanner;

public class CanMakeTriangle7_3 {
	public static void main(String[] args) {
		Scanner Number = new Scanner(System.in);
		System.out.println("数字を入力");
		int num1 = Number.nextInt();
//		System.out.println("数字を入力");
		int num2 = Number.nextInt();
//		System.out.println("数字を入力");
		int num3 = Number.nextInt();
		if (( num1 + num2 > num3) && ( num1 + num3 > num2) &&( num2 + num3 > num1)){
			System.out.println("三角形成立");
		} else {
			System.out.println("三角形できず");
		}
	}
}
