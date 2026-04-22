package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Map;

public class Exercise2 {
	public static void main(String[] args) {
		Map<String, Integer> fruitMap = new HashMap<>(
				Map.of("Apple", 100, "Orange", 80, "Banana", 120, "Strawberry", 300));
		String order = "Banana";
		if ( fruitMap.containsKey(order) ) {
			System.out.println(fruitMap.get(order));
		} else {
			System.out.println("ありません");
		}
	}
}
