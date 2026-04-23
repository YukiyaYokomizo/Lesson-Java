package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class Extendedfor_12 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		for (int n : numbers) {
			System.out.println(n);
		}
	}
}