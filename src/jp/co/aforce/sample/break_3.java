package jp.co.aforce.sample;

public class break_3 {
	public static void main(String[] args) {
		int[][] numbers = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
		outer:
		for(int i = 0 ; i < 2; i++) {
			for(int j = 0 ; j < 5; j++) {
				if(numbers[i][j] == 5) {
					break outer;
				}
				System.out.println(numbers[i][j]);
			}
		}
	}
}
