package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 2, 3, 1));
		HashSet<Integer> set = new HashSet<>(list);
		System.out.println(set);
	}
}
