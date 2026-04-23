package jp.co.aforce.sample;

import java.util.Scanner;

public class MonthName {
	public static void main(String[] args) {
		Scanner numbers = new Scanner(System.in);
		System.out.println("数字");
		int num = numbers.nextInt();
		switch (num) {
		case 1:
			System.out.print("１月");
			break;
		case 2:
			System.out.print("2月");
			break;
		case 3:
			System.out.print("3月");
			break;
		case 4:
			System.out.print("4月");
			break;
		case 5:
			System.out.print("5月");
			break;
		case 6:
			System.out.print("6月");
			break;
		case 7:
			System.out.print("7月");
			break;
		case 8:
			System.out.print("8月");
			break;
		case 9:
			System.out.print("9月");
			break;
		case 10:
			System.out.print("１0月");
			break;
		case 11:
			System.out.print("１1月");
			break;
		case 12:
			System.out.print("１2月");
			break;
		default:
			System.out.println("ありません");
		}
	}

}
