package jp.co.aforce;

import java.util.ArrayList;
import java.util.List;

public class PracticeTest4 {
	public static void main(String[] args) {
		//5-1
		List<String> animals = new ArrayList<>(List.of("犬", "猫", "うさぎ", "へび"));
		System.out.println(animals);
		
		//5-2
		String myFavorite = "イルカ";
		if (animals.contains(myFavorite)) {
			System.out.println(myFavorite + "はリストに含まれています");
		} else {
			System.out.println(myFavorite + "はリストに含まれていません");
		}
		
		//5-3
		
		
		//5-4
		//1月だったら、２月だったら、３月だったら、、、と同じような条件が１２個も並ぶので、switchを選んだ。
		
		
	}
}
