package jp.co.aforce.sample;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(List.of(1,2, 3, 4, 5));
		Collections.reverse(numbers);
		System.out.println(numbers);
	}
}
