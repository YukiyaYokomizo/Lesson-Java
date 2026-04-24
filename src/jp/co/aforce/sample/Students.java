package jp.co.aforce.sample;

public class Students {
	String name;
	int[] scores;
	int sum = 0;
	
	void showInfo() {
		for(int i : scores) {
			sum += i;
		}
		double average = sum / scores.length ;
		System.out.println("合計:" + sum + "\n平均:" + average);
	}
	
	public static void main(String[] args) {
		Students students1 = new Students();
		Students students2 = new Students();
		Students students3 = new Students();
		
		students1.name = "Taro";
		students2.name = "Jiro";
		students3.name = "Saburo";
		
		students1.scores = new int[] {50, 60, 70};
		students2.scores = new int[] {80, 90, 100};
		students3.scores = new int[] {100, 100, 100};
		
		students1.showInfo();
		students2.showInfo();
		students3.showInfo();
	}
}
