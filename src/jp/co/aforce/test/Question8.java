package jp.co.aforce.test;
//難しくはなかった（合っていれば）。
import java.util.ArrayList;
import java.util.List;

public class Question8 {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("リンゴ");
		fruits.add("バナナ");
		fruits.add("さくらんぼ");
		fruits.remove(1);
		fruits.add("オレンジ");
		//確認
		System.out.println(fruits);
	}
}
