package jp.co.aforce.sample;

import java.util.Scanner;

public class Sunday_start7_3 {
	public static void main(String[] args) {
		Scanner Numbers = new Scanner(System.in);
		System.out.println("数字を入力");
		int num = Numbers.nextInt();
		if ( num > 0 && num < 8) {
			switch( num ) {
			case 1 :
				System.out.println("日曜日");
				break;
			case 2 :
				System.out.println("月曜日");
				break;
			case 3 :
				System.out.println("火曜日");
				break;
			case 4 :
				System.out.println("水曜日");
				break;
			case 5 :
				System.out.println("木曜日");
				break;
			case 6 :
				System.out.println("金曜日");
				break;
			case 7 :
				System.out.println("土曜日");
				break;
			}
		} else {
			System.out.println("ありえない数字");
		}
	}
}
