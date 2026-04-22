package jp.co.aforce.sample;

public class NumFloat {
	public static void main(String[] args) {
		double num = 7.8;
		int Num = (int) num;
		System.out.println(Num);
		System.out.println(num-Num);
		//7.875とかならうまくいくかも（2進数関係）
	}
}
