package jp.co.aforce.sample;

public class Extendedfor_5 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		int sum = 0;
		for(int n : numbers) {
			sum += n;
		}
		System.out.println(sum);
	}
}
