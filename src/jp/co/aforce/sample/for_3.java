package jp.co.aforce.sample;

public class for_3 {
	public static void main(String[] args) {
		int j = 1;
		int k = 1;
		System.out.println(k + "," + j);
		for (int i=1; i < 11; i++) {
			k = j + k;
			j = j + k;
			System.out.println(k + "," + j);
		}
	}
}
