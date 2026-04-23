package jp.co.aforce.sample;

public class Extendedfor_3 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 8};
		int j=0;
		for(int n : numbers) {
			j = j + n;
		}
		System.out.println(j);
	}
}
