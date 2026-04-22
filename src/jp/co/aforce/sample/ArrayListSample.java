package jp.co.aforce.sample;
import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4));
		System.out.println(numbers);
//		List<Integer> numbers = new ArrayList<>();
//		numbers.add(1);
//		numbers.add(2);
//		numbers.add(3);
//		numbers.add(4);
		int element1 = numbers.get(1);
		System.out.println(element1);
		numbers.remove(1);
		numbers.remove(2);
//		System.out.println(numbers);
		numbers.add(2);
		numbers.add(5);
		numbers.add(6);
		System.out.println(numbers);
		numbers.set(Integer.valueOf(2),  4);
//		numbers.remove(2);
//		numbers.add(2, 4);
		System.out.println(numbers);
		numbers.clear();
		System.out.println(numbers);
	}
}