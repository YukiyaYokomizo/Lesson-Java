package jp.co.aforce.SecTen;

public class Car {
	int speed = 50;
	int weight;

	Car(int weight) {
		this.weight = weight;
	}

	void show() {
		System.out.println("n-");
	}

	public static void main(String[] args) {
		Car car = new Car(42);
		car.show();
	}
}
