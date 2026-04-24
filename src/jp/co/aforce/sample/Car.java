package jp.co.aforce.sample;

public class Car {
	String model;
	int speed;
	
	void showInfo() {
		System.out.println(model +"/"+ speed);
	}
	
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.model = "model1";
		car2.model = "model2";
		
		car1.speed = 120;
		car2.speed = 150;
		
		car1.showInfo();
		car2.showInfo();
	}
}
