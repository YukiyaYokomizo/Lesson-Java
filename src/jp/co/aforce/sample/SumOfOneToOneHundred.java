package jp.co.aforce.sample;

public class SumOfOneToOneHundred {
	public static void main(String[] args) {
		int i = 1;
		int j = 0;
		while (i < 101) {
			j = j+i;
			i = i+1;
		}
		System.out.println(j);
	}
}
