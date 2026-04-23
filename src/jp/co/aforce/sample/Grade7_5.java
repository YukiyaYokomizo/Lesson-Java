package jp.co.aforce.sample;

import java.util.Scanner;

public class Grade7_5 {
	public static void main(String[] args) {
		Scanner Grade = new Scanner(System.in);
		System.out.println("成績");
		String grade = Grade.nextLine();
		switch(grade){
			case "A":
				System.out.print("5");
				break;
			case "B":
				System.out.print("4");
				break;
			case "C":
				System.out.print("3");
				break;
			case "D":
				System.out.print("2");
				break;
			case "F":
				System.out.print("1");
				break;
			default:
				System.out.println("なし");
			
		}
	}
}
