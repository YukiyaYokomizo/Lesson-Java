package jp.co.aforce.sample;
import java.util.HashMap;
import java.util.Map;

public class HashMapSample {
	public static void main(String[] args) {
		Map<String, Integer> nameMap = new HashMap<>(Map.of("Bob", 1, "Alice", 2, "John", 2, "Tom", 1));
//		nameMap.put("Bob", 1);
//		nameMap.put("Alice", 2);
//		nameMap.put("John", 2);
//		nameMap.put("Tom", 1);
		System.out.println(nameMap);
		Integer value = nameMap.get("Torou");
		System.out.println(value);
	}
}
