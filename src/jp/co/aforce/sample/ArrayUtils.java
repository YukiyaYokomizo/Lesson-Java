package jp.co.aforce.sample;

public class ArrayUtils {

	static int max(int[] numbers) {
		int maxValue = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > maxValue) {
				maxValue = numbers[i];
			}
		}
		return maxValue;
	}

	public static void main(String[] args) {
		int[] scores = { 70, 85, 60, 98, 78 };

		int result = ArrayUtils.max(scores);
		System.out.println(result);
	}
}
