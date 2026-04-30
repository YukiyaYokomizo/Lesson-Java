package jp.co.aforce.sample;

public class Seasons {
	enum Season {
		Spring, Summer, Fall, Winter
	}

	public static void main(String[] args) {
		for (Season i : Season.values()) {
			System.out.println(i);
		}

	}
}
