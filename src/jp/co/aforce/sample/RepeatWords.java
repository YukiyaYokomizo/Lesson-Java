package jp.co.aforce.sample;

public class RepeatWords {
	public static String repeat(String word, int times) {
		String result = "";

		for (int i = 0; i < times; i++) {
			result += word;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(repeat("Java", 3));
	}
}
