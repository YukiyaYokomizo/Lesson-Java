package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckNumberList {
	public static void main(String[] args) {
		Scanner Number = new Scanner(System.in);
		System.out.println("数字を入力");
		int num = Number.nextInt(); 
//		int num = 12;
		List<String> list = new ArrayList<>();
		if (num > 10) {
			list.add("large");
		} else {
			list.add("small");
		}
		System.out.println(list);
	}
}


//Scanner fruit = new Scanner(System.in);
//System.out.println("果物を入力してください");
//String buy = fruit.nextLine();

