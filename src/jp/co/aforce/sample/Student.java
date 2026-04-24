package jp.co.aforce.sample;

public class Student {
	String name;
	int[] scores;

	void showaverage() {
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		double average = (double) sum / scores.length;
		System.out.print("平均点" + average);
	}
	public static void main(String[] args) {
		Student student1 = new Student();
		
		student1.name = "Yamada";
		student1.scores = new int[] {80, 90, 70};
		
		student1.showaverage();
	}
}