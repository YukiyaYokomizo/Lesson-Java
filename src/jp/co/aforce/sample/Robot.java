package jp.co.aforce.sample;

public class Robot {
	String name;
	int armlength;

	void move() {
		System.out.println( name + "の腕の長さは" + armlength + "cmです");
	}

	public static void main(String[] args) {
		Robot robo = new Robot();
		Robot rodo = new Robot();
		
		robo.name = "Taro";
		rodo.name = "Jiro";
		
		robo.armlength = 120;
		rodo.armlength = 180;

		robo.move();
		rodo.move();
	}

}
