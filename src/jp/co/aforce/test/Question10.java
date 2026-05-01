package jp.co.aforce.test;
//問題を読んでも何すればいいのかわからなかった。精進します。。。
import java.util.ArrayList;
import java.util.List;

public class Question10 {
	public static void main(String[] args) {
		List<String> task = new ArrayList<>();
		task.add("TASK001");
		task.add("TASK002");
		task.add("TASK003");
		task.add("TASK001");
		task.add("TASK004");
		task.add("TASK002");
		
		for (String i : task) {
			System.out.println("-" + i);
		}
	}
}
