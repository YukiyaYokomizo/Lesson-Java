package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Exercise {
	public static void main(String[] args) {
		Map<String, Integer> fruitMap = new HashMap<>(
				Map.of("Apple", 100, "Orange", 80, "Banana", 120, "Strawberry", 300));
		Scanner fruit = new Scanner(System.in);
		System.out.println("果物を入力してください");
		String buy = fruit.nextLine();
		if (buy.equals("Apple")) {
			System.out.println(fruitMap.get("Apple"));
		} else if (buy.equals("Orange")) {
			System.out.println(fruitMap.get("Orange"));
		} else if (buy.equals("Banana")) {
			System.out.println(fruitMap.get("Banana"));
		} else if (buy.equals("Strawberry")) {
			System.out.println(fruitMap.get("Strawberry"));
		} else {
			System.out.println("取り扱っておりません");
		}
	}
}